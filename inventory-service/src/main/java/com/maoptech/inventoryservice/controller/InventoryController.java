package com.maoptech.inventoryservice.controller;

import com.maoptech.inventoryservice.service.InventoryService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public Boolean isInStock(@PathVariable ("sku-code") String skuCode)
    {
        return inventoryService.isInStock(skuCode);
    }
}
