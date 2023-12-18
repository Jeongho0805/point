//package com.point.service;
//
//import com.point.domain.PointHistory;
//import com.point.repository.PointHistoryRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.Page;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//@Transactional
//@RequiredArgsConstructor
//public class PointHistoryService {
//
//    private final PointHistoryRepository pointHistoryRepository;
//
//    public Page<PointHistory> findAllByPage(int offset) {
//        List<PointHistory> content = new ArrayList<>();
//        int start = offset;
//        while (true) {
//            List<PointHistory> result = pointHistoryRepository.findByCondition(start);
//
//            start += 5;
//
//
//        }
//        pointHistoryRepository.findByCondition(offset);
//
//
//
//
//    }
//}
