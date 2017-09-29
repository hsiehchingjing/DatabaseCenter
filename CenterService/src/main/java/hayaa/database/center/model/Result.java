package hayaa.database.center.model;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午4:19 by谢青靖（xieqj@cloud-young.com）创建
 */
public class Result<T> {
    private T data;
    private Boolean methodResult;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getMethodResult() {
        return methodResult;
    }

    public void setMethodResult(Boolean methodResult) {
        this.methodResult = methodResult;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private String msg;
    private String error;
    private String code;
    public Result(T result) {
        this.data = result;
        this.methodResult = true;
    }
    public Result(String errCode, String errMsg) {
        this.error = errMsg;
        this.code = errCode;
        this.methodResult = false;
    }

    public Result(T result, String errCode, String errMsg) {
        this.data = result;
        this.error = errMsg;
        this.code = errCode;
        this.methodResult = false;
    }
}
