package com.demo.step2_javabeans_setter;

import com.demo.step2_javabeans_setter.entity.House;
import com.demo.step2_javabeans_setter.service.ConstructionService;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. VẤN ĐỀ 1: TRẠNG THÁI KHÔNG NHẤT QUÁN (Inconsistent State)");

        House customHouse = new House();
        customHouse.setFoundation("Móng băng");
        customHouse.setStructure("Gạch ống");

        customHouse.setHasGarden(true);
        customHouse.setHasCCTV(true);


        System.out.println("Căn nhà bị lỗi (Chưa xây xong đã đưa vào sử dụng): \n" + customHouse);

        System.out.println("2. VẤN ĐỀ 2: VI PHẠM TÍNH BẤT BIẾN (Mutability)");

        ConstructionService service = new ConstructionService();
        House myVilla = service.buildLuxuryVilla();
        System.out.println("\nBiệt thự ban đầu: Móng là '" + myVilla.toString().substring(19, 36) + "'"); // Demo cắt chuỗi lấy móng


        myVilla.setFoundation("Cột gỗ mục nát");

        System.out.println("Biệt thự sau khi bị phá hoại: Móng là '" + myVilla.toString().substring(19, 36) + "'");
        System.out.println("=> HẬU QUẢ: Nhà đã xây xong, đang ở, tự nhiên bị đổi mất cái móng. Dữ liệu hệ thống hoàn toàn mất kiểm soát!");
    }
}
