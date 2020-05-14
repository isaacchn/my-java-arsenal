package me.isaac.annotation;

public class MarkerParam {
    @RequestParamField(paramName = "marker_name", operator = Operator.LIKE)
    private String markerName;//标志点名称（模糊搜索）
    @RequestParamField(paramName = "marker_type")
    private String markerType;//标志点类型
}
