package me.isaac.annotation;

public class MarkerParamChild extends MarkerParam {
    @RequestParamField(paramName = "marker_comment", operator = Operator.LIKE)
    private String markerComment;
}
