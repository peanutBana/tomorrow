package com.tomorrow.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QManager is a Querydsl query type for Manager
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QManager extends EntityPathBase<Manager> {

    private static final long serialVersionUID = -1944547042L;

    public static final QManager manager = new QManager("manager");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath password = createString("password");

    public final StringPath pNum = createString("pNum");

    public final EnumPath<com.tomorrow.constant.Role> role = createEnum("role", com.tomorrow.constant.Role.class);

    public final StringPath userId = createString("userId");

    public final StringPath userNm = createString("userNm");

    public final StringPath userProfile = createString("userProfile");

    public QManager(String variable) {
        super(Manager.class, forVariable(variable));
    }

    public QManager(Path<? extends Manager> path) {
        super(path.getType(), path.getMetadata());
    }

    public QManager(PathMetadata metadata) {
        super(Manager.class, metadata);
    }

}

