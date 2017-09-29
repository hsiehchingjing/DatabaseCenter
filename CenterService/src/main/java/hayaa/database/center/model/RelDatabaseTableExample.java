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

public class RelDatabaseTableExample extends BaseModel {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelDatabaseTableExample() {
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

	 public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "Id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "Id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "Id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "Id");
            return (Criteria) this;
        } 

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

	 public Criteria andCurrenIsNull() {
            addCriterion("curren is null");
            return (Criteria) this;
        }

        public Criteria andCurrenIsNotNull() {
            addCriterion("curren is not null");
            return (Criteria) this;
        }

        public Criteria andCurrenEqualTo(Integer value) {
            addCriterion("curren =", value, "Curren");
            return (Criteria) this;
        }

        public Criteria andCurrenNotEqualTo(Integer value) {
            addCriterion("curren <>", value, "Curren");
            return (Criteria) this;
        }

        public Criteria andCurrenGreaterThan(Integer value) {
            addCriterion("curren >", value, "Curren");
            return (Criteria) this;
        }

        public Criteria andCurrenGreaterThanOrEqualTo(Integer value) {
            addCriterion("curren >=", value, "Curren");
            return (Criteria) this;
        }

        public Criteria andCurrenLessThan(Integer value) {
            addCriterion("curren <", value, "Curren");
            return (Criteria) this;
        }

        public Criteria andCurrenLessThanOrEqualTo(Integer value) {
            addCriterion("curren <=", value, "Curren");
            return (Criteria) this;
        }

        public Criteria andCurrenIn(List<Integer> values) {
            addCriterion("curren in", values, "Curren");
            return (Criteria) this;
        }

        public Criteria andCurrenNotIn(List<Integer> values) {
            addCriterion("curren not in", values, "Curren");
            return (Criteria) this;
        }

        public Criteria andCurrenBetween(Integer value1, Integer value2) {
            addCriterion("curren between", value1, value2, "Curren");
            return (Criteria) this;
        }

        public Criteria andCurrenNotBetween(Integer value1, Integer value2) {
            addCriterion("curren not between", value1, value2, "Curren");
            return (Criteria) this;
        } 

	 public Criteria andTabelIdIsNull() {
            addCriterion("tabelid is null");
            return (Criteria) this;
        }

        public Criteria andTabelIdIsNotNull() {
            addCriterion("tabelid is not null");
            return (Criteria) this;
        }

        public Criteria andTabelIdEqualTo(Integer value) {
            addCriterion("tabelid =", value, "TabelId");
            return (Criteria) this;
        }

        public Criteria andTabelIdNotEqualTo(Integer value) {
            addCriterion("tabelid <>", value, "TabelId");
            return (Criteria) this;
        }

        public Criteria andTabelIdGreaterThan(Integer value) {
            addCriterion("tabelid >", value, "TabelId");
            return (Criteria) this;
        }

        public Criteria andTabelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tabelid >=", value, "TabelId");
            return (Criteria) this;
        }

        public Criteria andTabelIdLessThan(Integer value) {
            addCriterion("tabelid <", value, "TabelId");
            return (Criteria) this;
        }

        public Criteria andTabelIdLessThanOrEqualTo(Integer value) {
            addCriterion("tabelid <=", value, "TabelId");
            return (Criteria) this;
        }

        public Criteria andTabelIdIn(List<Integer> values) {
            addCriterion("tabelid in", values, "TabelId");
            return (Criteria) this;
        }

        public Criteria andTabelIdNotIn(List<Integer> values) {
            addCriterion("tabelid not in", values, "TabelId");
            return (Criteria) this;
        }

        public Criteria andTabelIdBetween(Integer value1, Integer value2) {
            addCriterion("tabelid between", value1, value2, "TabelId");
            return (Criteria) this;
        }

        public Criteria andTabelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tabelid not between", value1, value2, "TabelId");
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

	 public Criteria andUpdateTimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updatetime <", value, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "UpdateTime");
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