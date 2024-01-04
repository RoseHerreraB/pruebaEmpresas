package com.nexos.herrera.domain.service;

import com.nexos.herrera.domain.Purchase;
import com.nexos.herrera.domain.repository.PurchaseRepository;
import com.nexos.herrera.persistencia.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PurchaseService {

 @Autowired
 private PurchaseRepository purchaseRepository;

 public List<Purchase> getAll() {
  return purchaseRepository.getAll();
 }

 public Optional<List<Purchase>> getByClient(String clientId) {
  return purchaseRepository.getByClient(clientId);
 }

 public Purchase save(Purchase purchase) {
  return purchaseRepository.save(purchase);
 }



}
