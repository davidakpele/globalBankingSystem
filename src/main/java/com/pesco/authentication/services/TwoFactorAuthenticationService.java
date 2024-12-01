package com.pesco.authentication.services;

import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import com.pesco.authentication.models.TwoFactorAuthentication;
import com.pesco.authentication.models.Users;
import com.pesco.authentication.payloads.OTPRequest;


public interface TwoFactorAuthenticationService {

    TwoFactorAuthentication createTwoFactorOtp(Optional<Users> authUser, String otp, String jwtToken);

    TwoFactorAuthentication findByUser(Long userid);

    TwoFactorAuthentication findById(Long id);

    boolean verifyTwoFactorOtp(TwoFactorAuthentication twoFactorOTP, String otp);

    void deleteTwoFactorOtp(TwoFactorAuthentication twoFactorOTP);

    ResponseEntity<?> findByToken(String token);

    ResponseEntity<?> verifyUserTwoFactorOtp(OTPRequest reqOtpPayload);

    ResponseEntity<?> enableTwoFactorKey(Boolean enable2fa, Authentication authentication);
}
