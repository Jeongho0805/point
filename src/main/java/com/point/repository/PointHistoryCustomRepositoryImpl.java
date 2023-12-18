package com.point.repository;

import com.point.domain.PointHistory;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


import java.util.List;

import static com.point.domain.QPointHistory.pointHistory;

@Repository
@RequiredArgsConstructor
public class PointHistoryCustomRepositoryImpl implements PointHistoryCustomRepository {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<PointHistory> findByCondition(int offset) {
        return jpaQueryFactory
                .selectFrom(pointHistory)
                .offset(offset)
                .limit(5)
                .fetch();
    }
}
