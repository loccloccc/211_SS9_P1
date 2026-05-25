package com.example.ss9_p1.service;




import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FlashSaleService {


    public void applyDiscount(String userId, String code) {

        //System.out.println("Đang xử lý mã: " + code + " cho user: " + userId)
        log.info("Đang xử lý mã: " + code + " cho user: " + userId);
        try {
            System.out.println("Thành công!");
        } catch (Exception e) {
            // System.out.println("Lỗi rồi!");
            log.error("Lỗi rồi!",e.getMessage());
            e.printStackTrace();
        }
    }
}
