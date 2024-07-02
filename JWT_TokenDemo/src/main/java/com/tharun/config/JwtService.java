package com.tharun.config;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

	//hard coding the secret key - used in getKey method
	//private static final String SECRET = "TmV3U2VjcmV0S2V5Rm9ySldUU2lnbmluZ1B1cnBvc2VzMTIzNDU2Nzg=\r\n";

	//Dynamic creation of Secret key
	private String secretKey;

	    public JwtService(){
	        secretKey = generateSecretKey();
	    }

	    //generate secret key
	    public String generateSecretKey() 
	    {
	        try 
	        {
	        	//Type of encryption algorithm we chose
	            KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
	            //Generate a random Secret key
	            SecretKey secretKey = keyGen.generateKey();
	            System.out.println("Secret Key : " + secretKey.toString());
	            //Encoding secret key
	            return Base64.getEncoder().encodeToString(secretKey.getEncoded());
	        } 
	        catch (NoSuchAlgorithmException e) {
	            throw new RuntimeException("Error generating secret key", e);
	        }
	    }

	    public String generateToken(String username) {

	        Map<String, Object> claims = new HashMap<>();
	        long currentTimeMillis = System.currentTimeMillis();

	     // Convert milliseconds to seconds
	     long totalSeconds = currentTimeMillis / 1000;

	     // Convert seconds to minutes and remaining seconds
	     long minutes = totalSeconds / 60;
	     long seconds = totalSeconds % 60;

	     System.out.println("Created time: " + minutes + " minutes " + seconds + " seconds");
	        return Jwts.builder()
	                .setClaims(claims)
	                .setSubject(username)
	                .setIssuedAt(new Date(System.currentTimeMillis()))
	                //1000 milliseconds * 60 seconds * minutes
	                .setExpiration(new Date(System.currentTimeMillis() + 1000*60*3))
	                .signWith(getKey(), SignatureAlgorithm.HS256).compact();

	    }

	    private Key getKey() {
	        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
	        return Keys.hmacShaKeyFor(keyBytes);
	    }

	    public String extractUserName(String token) {
	        // extract the username from jwt token
	        return extractClaim(token, Claims::getSubject);
	    }

	    private <T> T extractClaim(String token, Function<Claims, T> claimResolver) {
	        final Claims claims = extractAllClaims(token);
	        return claimResolver.apply(claims);
	    }

	    private Claims extractAllClaims(String token) {
	        return Jwts.parserBuilder()
	                .setSigningKey(getKey())
	                .build().parseClaimsJws(token).getBody();
	    }


	    public boolean validateToken(String token, UserDetails userDetails) {
	        final String userName = extractUserName(token);
	        return (userName.equals(userDetails.getUsername()) && !isTokenExpired(token));
	    }

	    private boolean isTokenExpired(String token) {
	        return extractExpiration(token).before(new Date());
	    }

	    private Date extractExpiration(String token) {
	        return extractClaim(token, Claims::getExpiration);
	    }
}
