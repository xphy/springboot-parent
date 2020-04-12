package com.phy.java.singleton;

public enum ResponseDto {
    //定义两个实例，一个表示请求成功，一个表示请求失败
    HTTP_200(200,"请求成功"), HTTP_500(500,"请求失败");

    //枚举和普通的类一样，可以定义属性，构造函数，getter setter，普通方法，
    private Integer code;
    private String msg;

    ResponseDto(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static void main(String [] args){
        System.out.println(ResponseDto.HTTP_200);
        System.out.println(ResponseDto.HTTP_500);
        System.out.println(ResponseDto.HTTP_200==ResponseDto.HTTP_200);
        System.out.println(ResponseDto.HTTP_200.equals(ResponseDto.HTTP_200));
        System.out.println(ResponseDto.HTTP_200.getMsg());
        System.out.println(ResponseDto.HTTP_500.getMsg());
    }
}
