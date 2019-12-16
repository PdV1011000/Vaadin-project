package com.gmail.stein.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.stein.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
