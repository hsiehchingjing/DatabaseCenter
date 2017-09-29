package hayaa.database.center.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2017/09/29 05:27  by  姓名 （邮箱前缀@cloud-young.com）创建
 */

public class DatabaseExample extends BaseModel {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DatabaseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria implements java.io.Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

       
		
		
			//alias

	 public Criteria andDatabaseIdIsNull() {
            addCriterion("databaseid is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseIdIsNotNull() {
            addCriterion("databaseid is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseIdEqualTo(Integer value) {
            addCriterion("databaseid =", value, "DatabaseId");
            return (Criteria) this;
        }

        public Criteria andDatabaseIdNotEqualTo(Integer value) {
            addCriterion("databaseid <>", value, "DatabaseId");
            return (Criteria) this;
        }

        public Criteria andDatabaseIdGreaterThan(Integer value) {
            addCriterion("databaseid >", value, "DatabaseId");
            return (Criteria) this;
        }

        public Criteria andDatabaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("databaseid >=", value, "DatabaseId");
            return (Criteria) this;
        }

        public Criteria andDatabaseIdLessThan(Integer value) {
            addCriterion("databaseid <", value, "DatabaseId");
            return (Criteria) this;
        }

        public Criteria andDatabaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("databaseid <=", value, "DatabaseId");
            return (Criteria) this;
        }

        public Criteria andDatabaseIdIn(List<Integer> values) {
            addCriterion("databaseid in", values, "DatabaseId");
            return (Criteria) this;
        }

        public Criteria andDatabaseIdNotIn(List<Integer> values) {
            addCriterion("databaseid not in", values, "DatabaseId");
            return (Criteria) this;
        }

        public Criteria andDatabaseIdBetween(Integer value1, Integer value2) {
            addCriterion("databaseid between", value1, value2, "DatabaseId");
            return (Criteria) this;
        }

        public Criteria andDatabaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("databaseid not between", value1, value2, "DatabaseId");
            return (Criteria) this;
        } 

	 public Criteria andDatabasetitleIsNull() {
            addCriterion("databasetitle is null");
            return (Criteria) this;
        }

        public Criteria andDatabasetitleIsNotNull() {
            addCriterion("databasetitle is not null");
            return (Criteria) this;
        }

        public Criteria andDatabasetitleEqualTo(String value) {
            addCriterion("databasetitle =", value, "Databasetitle");
            return (Criteria) this;
        }

        public Criteria andDatabasetitleNotEqualTo(String value) {
            addCriterion("databasetitle <>", value, "Databasetitle");
            return (Criteria) this;
        }

        public Criteria andDatabasetitleGreaterThan(String value) {
            addCriterion("databasetitle >", value, "Databasetitle");
            return (Criteria) this;
        }

        public Criteria andDatabasetitleGreaterThanOrEqualTo(String value) {
            addCriterion("databasetitle >=", value, "Databasetitle");
            return (Criteria) this;
        }

        public Criteria andDatabasetitleLessThan(String value) {
            addCriterion("databasetitle <", value, "Databasetitle");
            return (Criteria) this;
        }

        public Criteria andDatabasetitleLessThanOrEqualTo(String value) {
            addCriterion("databasetitle <=", value, "Databasetitle");
            return (Criteria) this;
        }

        public Criteria andDatabasetitleIn(List<String> values) {
            addCriterion("databasetitle in", values, "Databasetitle");
            return (Criteria) this;
        }

        public Criteria andDatabasetitleNotIn(List<String> values) {
            addCriterion("databasetitle not in", values, "Databasetitle");
            return (Criteria) this;
        }

        public Criteria andDatabasetitleBetween(String value1, String value2) {
            addCriterion("databasetitle between", value1, value2, "Databasetitle");
            return (Criteria) this;
        }

        public Criteria andDatabasetitleNotBetween(String value1, String value2) {
            addCriterion("databasetitle not between", value1, value2, "Databasetitle");
            return (Criteria) this;
        } 

	 public Criteria andDatabaseremarkIsNull() {
            addCriterion("databaseremark is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseremarkIsNotNull() {
            addCriterion("databaseremark is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseremarkEqualTo(String value) {
            addCriterion("databaseremark =", value, "Databaseremark");
            return (Criteria) this;
        }

        public Criteria andDatabaseremarkNotEqualTo(String value) {
            addCriterion("databaseremark <>", value, "Databaseremark");
            return (Criteria) this;
        }

        public Criteria andDatabaseremarkGreaterThan(String value) {
            addCriterion("databaseremark >", value, "Databaseremark");
            return (Criteria) this;
        }

        public Criteria andDatabaseremarkGreaterThanOrEqualTo(String value) {
            addCriterion("databaseremark >=", value, "Databaseremark");
            return (Criteria) this;
        }

        public Criteria andDatabaseremarkLessThan(String value) {
            addCriterion("databaseremark <", value, "Databaseremark");
            return (Criteria) this;
        }

        public Criteria andDatabaseremarkLessThanOrEqualTo(String value) {
            addCriterion("databaseremark <=", value, "Databaseremark");
            return (Criteria) this;
        }

        public Criteria andDatabaseremarkIn(List<String> values) {
            addCriterion("databaseremark in", values, "Databaseremark");
            return (Criteria) this;
        }

        public Criteria andDatabaseremarkNotIn(List<String> values) {
            addCriterion("databaseremark not in", values, "Databaseremark");
            return (Criteria) this;
        }

        public Criteria andDatabaseremarkBetween(String value1, String value2) {
            addCriterion("databaseremark between", value1, value2, "Databaseremark");
            return (Criteria) this;
        }

        public Criteria andDatabaseremarkNotBetween(String value1, String value2) {
            addCriterion("databaseremark not between", value1, value2, "Databaseremark");
            return (Criteria) this;
        } 

	 public Criteria andDatabasenameIsNull() {
            addCriterion("databasename is null");
            return (Criteria) this;
        }

        public Criteria andDatabasenameIsNotNull() {
            addCriterion("databasename is not null");
            return (Criteria) this;
        }

        public Criteria andDatabasenameEqualTo(String value) {
            addCriterion("databasename =", value, "Databasename");
            return (Criteria) this;
        }

        public Criteria andDatabasenameNotEqualTo(String value) {
            addCriterion("databasename <>", value, "Databasename");
            return (Criteria) this;
        }

        public Criteria andDatabasenameGreaterThan(String value) {
            addCriterion("databasename >", value, "Databasename");
            return (Criteria) this;
        }

        public Criteria andDatabasenameGreaterThanOrEqualTo(String value) {
            addCriterion("databasename >=", value, "Databasename");
            return (Criteria) this;
        }

        public Criteria andDatabasenameLessThan(String value) {
            addCriterion("databasename <", value, "Databasename");
            return (Criteria) this;
        }

        public Criteria andDatabasenameLessThanOrEqualTo(String value) {
            addCriterion("databasename <=", value, "Databasename");
            return (Criteria) this;
        }

        public Criteria andDatabasenameIn(List<String> values) {
            addCriterion("databasename in", values, "Databasename");
            return (Criteria) this;
        }

        public Criteria andDatabasenameNotIn(List<String> values) {
            addCriterion("databasename not in", values, "Databasename");
            return (Criteria) this;
        }

        public Criteria andDatabasenameBetween(String value1, String value2) {
            addCriterion("databasename between", value1, value2, "Databasename");
            return (Criteria) this;
        }

        public Criteria andDatabasenameNotBetween(String value1, String value2) {
            addCriterion("databasename not between", value1, value2, "Databasename");
            return (Criteria) this;
        } 

	 public Criteria andDatabasetypeIsNull() {
            addCriterion("databasetype is null");
            return (Criteria) this;
        }

        public Criteria andDatabasetypeIsNotNull() {
            addCriterion("databasetype is not null");
            return (Criteria) this;
        }

        public Criteria andDatabasetypeEqualTo(String value) {
            addCriterion("databasetype =", value, "Databasetype");
            return (Criteria) this;
        }

        public Criteria andDatabasetypeNotEqualTo(String value) {
            addCriterion("databasetype <>", value, "Databasetype");
            return (Criteria) this;
        }

        public Criteria andDatabasetypeGreaterThan(String value) {
            addCriterion("databasetype >", value, "Databasetype");
            return (Criteria) this;
        }

        public Criteria andDatabasetypeGreaterThanOrEqualTo(String value) {
            addCriterion("databasetype >=", value, "Databasetype");
            return (Criteria) this;
        }

        public Criteria andDatabasetypeLessThan(String value) {
            addCriterion("databasetype <", value, "Databasetype");
            return (Criteria) this;
        }

        public Criteria andDatabasetypeLessThanOrEqualTo(String value) {
            addCriterion("databasetype <=", value, "Databasetype");
            return (Criteria) this;
        }

        public Criteria andDatabasetypeIn(List<String> values) {
            addCriterion("databasetype in", values, "Databasetype");
            return (Criteria) this;
        }

        public Criteria andDatabasetypeNotIn(List<String> values) {
            addCriterion("databasetype not in", values, "Databasetype");
            return (Criteria) this;
        }

        public Criteria andDatabasetypeBetween(String value1, String value2) {
            addCriterion("databasetype between", value1, value2, "Databasetype");
            return (Criteria) this;
        }

        public Criteria andDatabasetypeNotBetween(String value1, String value2) {
            addCriterion("databasetype not between", value1, value2, "Databasetype");
            return (Criteria) this;
        } 

	 public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "Status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "Status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "Status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "Status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "Status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "Status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "Status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "Status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "Status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "Status");
            return (Criteria) this;
        } 

	 public Criteria andCreateTimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createtime =", value, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createtime <", value, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createtime in", values, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "CreateTime");
            return (Criteria) this;
        } 
		
       
    }

    public static class Criteria extends GeneratedCriteria implements java.io.Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements java.io.Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}