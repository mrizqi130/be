package com.example.demo_22;

import com.example.demo_22.dto.AccountResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@RestController
@RequestMapping("/api/v1.0/account-saving")
public class AccountController {

    @GetMapping("/{accountNumber}")
    public ResponseEntity<AccountResponse> getAccountDetails(
            @RequestHeader("Authorization") String authorizationToken,
            @RequestParam String userId,
            @RequestParam boolean financing) {

        // For simplicity, we assume the token is valid
        // In a real application, you would validate the token

        // Build the response body
        AccountResponse response = new AccountResponse();
        response.setRc("00");
        response.setStatusCode(200);
        response.setStatus("success");
        response.setMessage("Inquiry Rekening Berhasil");

        AccountResponse.Data data = new AccountResponse.Data();
        data.setACCNBR("0080210002622");
        data.setPRODID("06");
        data.setFULLNM("ARI AJMAL AMRULLOH");
        data.setNICKNM("ARI AJMAL AMRULLOH");
        data.setDTBAL("2024-05-20");
        data.setACCSTS(1);
        data.setAPPLID_BE("02");
        data.setPRODNM("TABUNGAN IB MASLAHAH (INSTAN)");

        response.setData(data);

        // Set headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Powered-By", "Express");
        headers.set("Access-Control-Allow-Origin", "*");
        headers.set("ETag", "W/\"11b-HJcwja3p2c72+pCSNwGvA/bwoU\"");
        headers.set("Date", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH)));
        headers.set("Keep-Alive", "timeout=5");
        headers.set("X-Content-Type-Options", "nosniff");
        headers.set("X-XSS-Protection", "1; mode=block");
        headers.set("Cache-Control", "no-cache, no-store, max-age=0, must-revalidate");
        headers.set("Pragma", "no-cache");
        headers.set("Expires", "0");
        headers.set("X-Frame-Options", "DENY");
        headers.set("Content-Type", "application/json;charset=utf-8");
        headers.set("Transfer-Encoding", "chunked");

        return new ResponseEntity<>(response, headers, HttpStatus.OK);
    }
}
