package com.yanle.prd.domain.rpc;

import lombok.*;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/10 15:38
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResultDTO<T> {
    private RpcCommonCode code;

    private String message;

    private T result;
}
