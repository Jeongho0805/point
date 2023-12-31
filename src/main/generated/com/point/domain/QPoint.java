package com.point.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPoint is a Querydsl query type for Point
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPoint extends EntityPathBase<Point> {

    private static final long serialVersionUID = -900441871L;

    public static final QPoint point = new QPoint("point");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> initBonusPoint = createNumber("initBonusPoint", Integer.class);

    public final NumberPath<Integer> initPoint = createNumber("initPoint", Integer.class);

    public final NumberPath<Integer> remainingBonusPoint = createNumber("remainingBonusPoint", Integer.class);

    public final NumberPath<Integer> remainingPoint = createNumber("remainingPoint", Integer.class);

    public final StringPath Status = createString("Status");

    public QPoint(String variable) {
        super(Point.class, forVariable(variable));
    }

    public QPoint(Path<? extends Point> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPoint(PathMetadata metadata) {
        super(Point.class, metadata);
    }

}

