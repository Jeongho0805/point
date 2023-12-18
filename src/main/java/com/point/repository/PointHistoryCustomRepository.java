package com.point.repository;

import com.point.domain.PointHistory;
import java.util.List;

public interface PointHistoryCustomRepository {

    List<PointHistory> findByCondition(int offset);
}
