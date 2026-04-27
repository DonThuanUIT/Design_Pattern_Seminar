package com.demo.step1_telescoping_constructor;

import com.demo.step1_telescoping_constructor.entity.House;
import com.demo.step1_telescoping_constructor.service.ConstructionService;

public class Main {
    public static void main(String[] args) {

        ConstructionService service = new ConstructionService();
        System.out.println("1. Xây Biệt Thự Mẫu:");
        System.out.println(service.buildLuxuryVilla());

        System.out.println("2. SỰ CỐ: KHÁCH HÀNG ĐẶT NHÀ THEO YÊU CẦU");
        System.out.println("Yêu cầu: Nhà 2 tầng, 4 phòng, CÓ sân vườn, KHÔNG hồ bơi, CÓ báo cháy, KHÔNG SmartHome");

        House customHouse = new House(
                "Móng cọc", "Bê tông", "Mái bằng",
                2, 4, 2,
                true, false, true,
                false, true, false,
                "Xanh nhạt", "Hiện đại"
        );

        System.out.println("\nKết quả bàn giao cho khách hàng:");
        System.out.println(customHouse);

    }
}