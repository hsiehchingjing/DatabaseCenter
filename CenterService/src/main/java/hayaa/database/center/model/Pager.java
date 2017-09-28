package hayaa.database.center.model;

import java.io.Serializable;
import java.util.List;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-28 下午4:37 by谢青靖（xieqj@cloud-young.com）创建
 */
public class Pager <T extends Serializable> implements Serializable {
    private static final int DEFAULT_PAGE_NO = 1;
    private static final int DEFAULT_PAGE_SIZE = 10;
    private int page;
    private int pageSize;
    private int totalPage;
    private long dataNumber;
    private List<T> content;
    private String msg;

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

    public Boolean getMethodResult() {
        return methodResult;
    }

    public void setMethodResult(Boolean methodResult) {
        this.methodResult = methodResult;
    }

    private String error;
    private String code;
    private Boolean methodResult;
    public Pager() {
        this(1, 10);
    }

    public Pager(int page, int pageSize) {
        this.page = page;
        this.pageSize = pageSize;
    }

    public Pager(int page, int pageSize, List<T> content) {
        this.page = page;
        this.pageSize = pageSize;
        this.content = content;
    }

    public List<T> getContent() {
        return this.content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public static int getDefaultPageNo() {
        return 1;
    }

    public static int getDefaultPageSize() {
        return 10;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalPage() {
        return this.totalPage != 0 ? (long)this.totalPage : (this.pageSize > 0 ? (this.dataNumber + (long)this.pageSize - 1L) / (long)this.pageSize : 0L);
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public long getDataNumber() {
        return this.dataNumber;
    }

    public void setDataNumber(long dataNumber) {
        this.dataNumber = dataNumber;
    }
}

