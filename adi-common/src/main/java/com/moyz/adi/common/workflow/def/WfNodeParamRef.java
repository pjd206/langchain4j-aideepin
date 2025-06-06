package com.moyz.adi.common.workflow.def;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * 输入参数-引用类型 参数定义<br/>
 * 1.该参数的值是另一个节点的输出/或输入参数<br/>
 * 2.该类型参数只在非开始节点中使用<br/>
 * 3.通常做为输入参数使用
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WfNodeParamRef implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @JsonProperty("node_uuid")
    private String nodeUuid;
    @JsonProperty("node_param_name")
    private String nodeParamName;
    private String name;
}
