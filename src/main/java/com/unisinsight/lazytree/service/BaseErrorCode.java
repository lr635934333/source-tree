/*
 * www.unisinsight.com Inc.
 * Copyright (c) 2018 All Rights Reserved
 */
package com.unisinsight.lazytree.service;

/**
 * description 错误码
 *
 * @author liuran [KF.liuran@h3c.com]
 * @date 2018/9/6 17:12
 * @since 1.0
 */
public enum BaseErrorCode {
    /**
     * 基础错误码00开头
     * */
    SYS_INTERNAL_ERROR("00001","系统内部异常"),
    SYS_INIT_ERROR("00002","系统初始化异常"),
    UNKNOWN_ERROR("00003","未知错误"),
    MEMORY_ALLOCATION_FAILED("00004","内存分配失败"),
    MEMORY_OVERFLOW_ERROR("00005","内存溢出"),
    REQUEST_TIMEOUT_ERROR("00006","请求超时"),
    INVALID_HANDLE("00007","非法句柄"),
    ENVIRONMENT_CHANGE_FAILED("00008","环境变更获取失败"),
    SYS_BUSY("00009","系统繁忙"),
    DATA_SOURCE_ERROR("00010","数据源异常"),
    FREQUENT_OPERATION("00011","当前操作频繁"),
    UNKNOWN_SOURCE_ERROR("00012","未知的请求源"),
    REQUEST_LIMIT_ERROR("00013","请求超过次数限制"),
    GET_CONFIGURATION_ERROR("00014","获取配置错误"),
    SET_CONFIGURATION_ERROR("00015","设置配置错误"),
    PROGRAM_RESTART_REQUIRED("00016","需要重启程序"),
    SYS_RESTART_REQUIRED("00017","需要重启系统"),
    FEATURE_NOT_SUPPORTED("00018","特性不支持"),
    VALIDATION_FAILED("00019","验证失败"),
    CALL_FAILED("00020","调用失败"),
    MESSAGE_COMPONENT_EXCEPTION("00021","消息组件异常"),
    INSUFFICIENT_STORAGE_CAPACITY("00022","存储容量不足"),
    STORAGE_SERVICE_ERROR("00023","存储服务错误"),
    NETWORK_ERROR("00024","网络错误"),
    ILLEGAL_IP_ADDRESS("00025","非法IP地址"),
    IP_FORBIDDEN_ERROR("00026","被禁止的IP"),
    DOMAIN_NAME_RESOLUTION_FAILED("00027","解析域名获取IP失败"),
    PORT_ERROR("00028","端口错误"),
    DOMAIN_ERROR("00029","域名错误"),
    IP_LIMIT_ERROR("00030","当前IP请求超过限制"),
    IP_EMPTY_ERROR("00031","IP地址不能为空"),
    CONNECTION_FAILED("00032","连接失败"),
    DATA_SENDING_FAILED("00033","数据发送失败"),
    DATA_RECEPTION_FAILED("00034","数据接收失败"),
    HTTP_CLIENT_INITIALIZATION_FAILED("00035","HTTP客户端初始化失败"),
    HTTP_REQUEST_FAILED("00036","HTTP请求失败"),
    HTTP_REQUEST_TIMEOUT("00037","HTTP请求超时"),
    HTTP_ERROR_400("00038","HTTP错误码400"),
    HTTP_ERROR_404("00039","HTTP错误码404"),
    HTTP_ERROR_500("00040","HTTP错误码500"),
    KAFKA_TOPIC_INVALID("00041","kafka的topic无效"),
    KAFKA_MESSAGE_SENDING_FAILED("00042","kafka消息发送失败"),
    DATABASE_ERROR("00043","数据库错误"),
    DATABASE_OPERATION_FAILED("00044","数据库操作失败"),
    RESULT_EMPTY_ERROR("00045","查询无结果"),
    ID_EMPTY_ERROR("00046","ID不能为空"),
    DATA_DUPLICATION("00047","数据重复"),
    DATA_UPDATING("00048","数据更新中"),
    DATA_NOT_UNIQUE_ERROR("00049", "查询结果不唯一"),
    DICTIONARY_ACQUISITION_FAILED("00050", "字典获取失败"),
    API_NOT_EXIST_ERROR("00051", "接口不存在"),
    INVALID_PARAM_ERROR("00052", "参数校验错误"),
    INVALID_INPUT_PARAMETER("00053", "无效入参"),
    MISSING_REQUIRED_PARAMETERS("00054", "缺少必要参数"),
    TYPE_NOT_SUPPORTED("00055", "类型不支持"),
    DUPLICATE_NAME("00056", "名称重复"),
    PARAMETER_EMPTY("00057", "参数为空"),
    LANGUAGE_NOT_SUPPORTED("00058", "不支持该语言"),
    API_OFF_ERROR("00059", "接口停用"),
    INTERFACE_MAINTENANCE("00060", "接口维护"),
    VERSION_ERROR("00061", "版本号错误"),
    VERIFICATION_CODE_ERROR("00062", "验证码错误"),
    NOT_EMPTY("00063", "%s不能为空"),
    MOBILE_NUMBER_ERROR("00064", "手机号码错误"),
    ID_NUMBER_ERROR("00065", "身份证号码错误"),
    EMAIL_ERROR("00066", "邮箱错误"),
    LONGITUDE_AND_LATITUDE_ERROR("00067", "经纬度错误"),
    REQUEST_PATH_ERROR("00068", "请求路径错误"),
    DATA_FORMAT_ERROR("00069", "数据格式错误"),
    TIME_FORMAT_ERROR("00070", "时间参数错误"),
    PLATE_NUMBER_ERROR("00071", "车牌号错误"),
    CAMERA_NUMBER_ERROR("00072", "摄像头编号错误"),
    CALLBACK_URL_ERROR("00073", "回调地址URL错误"),
    TIME_FORMAT_LIMIT_ERROR("00074", "时间格式必须是ISO-8601"),
    PAGE_NUMBER_LIMIT_ERROR("00075", "页码超出限制"),
    PAGE_SIZE_LIMIT_ERROR("00076", "分页大小超出限制"),
    THIRD_PARTY_INTERFACE_FAILED("00077", "调用第三方接口失败"),
    JSON_PARSING_ERROR("00078", "json解析错误"),
    JSON_FIELD_TYPE_ERROR("00079", "json消息字段类型错误"),
    JSON_FIELD_VALUE_ERROR("00080", "json消息字段取值错误"),
    JSON_FIELD_TYPE_MISSING("00081", "json消息字段缺失"),
    JSON_OBJECT_CREATE_FAILED("00082", "创建json对象失败"),
    JSON_ARRAY_CREATE_FAILED("00083", "创建json数组失败"),
    JSON_FORMAT_ERROR("00084", "json格式或内容错误"),
    FILE_NAME_ERROR("00085", "文件名错误"),
    FILE_ADDRESS_NOT_EXIST("00086", "文件地址不存在"),
    FILE_ID_NOT_EXIST("00087", "文件ID不存在"),
    FILE_ID_TOO_LONG("00088", "文件ID超长"),
    FILE_TYPE_ERROR("00089", "文件类型错误"),
    FILE_CREATE_ERROR("00090", "创建文件失败"),
    FILE_OPEN_ERROR("00091", "打开文件失败"),
    DOWNLOAD_ERROR("00092", "下载文件失败"),
    FILE_READ_ERROR("00093", "读取文件失败"),
    FILE_WRITE_ERROR("00094", "写入文件失败"),
    FILE_FORMAT_ERROR("00095", "文件格式错误"),
    FILE_IS_ENCRYPTED("00096", "文件被加密"),
    EXCEL_BUILD_FAILED("00097", "Excel生成失败"),
    EXCEL_IMPORT_FAILED("00098", "Excel导入失败"),
    ENCODING_CONVERSION_FAILED("00099", "文本编码转换失败"),
    FILE_UNRECOGNIZED("00100", "未识别文件"),
    FILE_SIZE_ERROR("00101", "文件大小超过限制"),
    FILE_UPLOAD_ERROR("00102", "文件上传失败"),
    FILE_IS_BEING_UPLOADED("00103", "其它用户正在上传该文件"),
    USER_NOT_EXIST("00104", "用户不存在"),
    USER_NOT_LOGGED_IN("00105", "用户未登录"),
    PERMISSION_DENY_ERROR("00106", "用户没有权限"),
    PASSWORD_ERROR("00107", "密码错误"),
    USERNAME_ALREADY_EXISTS("00108", "用户名已存在"),
    USERNAME_LENGTH_ERROR("00109", "用户名长度错误"),
    PASSWORD_LENGTH_ERROR("00110", "密码长度错误"),
    USERNAME_OR_PASSWORD_FORMAT_ERROR("00111", "用户名或密码格式错误"),
    USERNAME_OR_PASSWORD_EMPTY("00112", "用户名或密码为空"),
    LOGIN_EXPIRED("00113", "用户登录已过期"),
    SECURITY_AUTHENTICATION_FAILED("00114", "安全认证失败"),
    ACCOUNT_LOCKED("00115", "账号被锁定"),
    USER_ADD_ERROR("00116", "添加用户失败"),
    USER_DELETE_ERROR("00117", "删除用户失败"),
    USER_UPDATE_ERROR("00118", "修改用户失败"),
    USER_QUERY_ERROR("00119", "查询用户失败"),
    PASSWORD_UPDATE_ERROR("00120", "修改密码失败"),
    NEW_PASSWORD_ERROR("00121", "新密码错误"),
    NEW_PASSWORD_LENGTH_ERROR("00122", "新密码长度错误"),
    OLD_PASSWORD_LENGTH_ERROR("00123", "原密码长度错误"),
    OLD_PASSWORD_ERROR("00124", "原密码错误"),
    PASSWORD_SAME_ERROR("00125", "新密码与原密码相同"),
    USERNAME_OR_PASSWORD_ERROR("00126", "用户名或密码错误"),
    DEVICE_ACQUISITION_FAILED("00127", "设备获取失败"),
    CHANNEL_ACQUISITION_FAILED("00128", "通道获取失败"),
    DEVICE_OFFLINE("00129", "设备离线"),
    RESOURCE_TREE_ACQUISITION_FAILED("00130", "资源树获取失败"),
    RESOURCE_EXIST_ERROR("00131", "资源已经存在"),
    DEVICE_NOT_EXIST("00132", "设备不存在"),
    DEVICE_ALREADY_EXISTS("00133", "设备已经存在"),
    DEVICE_LIMIT_ERROR("00134", "设备数达到上限"),
    CHANNEL_LIMIT_ERROR("00135", "通道数达到上限"),
    CAMERA_ID_ERROR("00136", "相机ID错误"),
    CAMERA_NAME_ERROR("00137", "相机名错误"),
    IPC_CODE_TOO_LONG("00138", "IPC设备编码超长"),
    IPC_NAME_TOO_LONG("00139", "IPC设备名称超长"),
    IPC_STYLE_ACQUISITION_FAILED("00140", "获取IPC款型失败"),

    INSERT_FAILED("01001", "创建失败"),
    UPDATE_FAILED("01002", "更新失败"),
    DELETE_FAILED("01003", "删除失败"),
    PRIMARY_KEY_NOT_EMPTY_ERROR("01004", "主键不能为空"),
    SQL_EXCEPTION("01005", "SQL执行异常"),
    HTTP_REQUEST_METHOD_NOT_SUPPORTED_ERROR("01006", "不支持的请求方法"),
    PARAM_SWITCH_ERROR("01007", "参数转换异常"),
    DATA_EMPTY_ERROR("01008", "无数据"),
    ;

    private IErrorCode error;

    BaseErrorCode(String errorCode, String message){

    }
    public IErrorCode of(){
        return error;
    }

    public String getErrorCode(){
        return error.getErrorCode();
    }

    public String getMessage(){
        return error.getMessage();
    }

}
