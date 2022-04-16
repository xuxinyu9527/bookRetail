package com.xuxinyu.bookRetail.common;

/**
 * @version V1.0
 * @Title: CodeConstants
 * @Package com.xuxinyu.bookRetail.common
 * @Description: TODO 静态代码
 * @author: runoob
 * @date: 2022-04-16 13:44
 */
public class CodeConstants {
    public static class Basic {
        /** 0 值字符串 */
        public static final String ZERO_CODE = "0";
        /** 0值数字*/
        public static final Integer ZERO_NUM = 0;
        /** -1值字符 */
        public static final String ONE_MINUS = "-1";
        /** -1值数字类型*/
        public static final Integer MINUS_NUM = -1;
        /** 1值数字 */
        public static final Integer ONE_NUM = 1;
        /** 1值 字符串 */
        public static final String STR_ONE = "1";

        /** retCode */
        public static final String RET_CODE = "retCode";
        /** retMsg */
        public static final String RET_MSG = "retMsg";
        /** retData */
        public static final String RET_DATA = "retData";
        /** 返回数量 */
        public static final Object RET_COUNT = "retCount";
        /** 成功返回值 */
        public static final String SUCCESS = "success";
        /** 失败返回值*/
        public static final String FAIL = "fail";
        public static final int RESULT_CODE_SUCCESS = 200;  // 成功处理请求
        public static final int RESULT_CODE_BAD_REQUEST = 412;  // 请求错误
        public static final int RESULT_CODE_NOT_LOGIN = 402;  // 未登录
        public static final int RESULT_CODE_PARAM_ERROR = 406;  // 传参错误
        public static final int RESULT_CODE_SERVER_ERROR = 500;  // 服务器错误
        /** 异常异常返回值*/
        public static final String SYSTEM_ERROR = "系统异常";
        /** 保存成功 */
        public static final String SUCCESS_SAVE = "保存成功";
        /** 保存失败 */
        public static final String FAIL_SAVE = "保存失败";
        /** 更新失败 */
        public static final String FAIL_UPDATE = "更新失败";
        /** 删除失败 */
        public static final String FAIL_DELETE= "删除失败";
        /** 查询失败*/
        public static final String FAIL_QUERY = "查询失败";
        /** 重复数据 */
        public static final String DUPLICATE_DATA= "重复数据";

        /** 新增*/
        public static final String ADD = "add";
        /** 更新*/
        public static final String UPD = "upd";
        /** 刪除*/
        public static final String DEL = "del";

        public static final String RES_CODE = "code";
        public static final String RES_MSG = "msg";

    }
}
