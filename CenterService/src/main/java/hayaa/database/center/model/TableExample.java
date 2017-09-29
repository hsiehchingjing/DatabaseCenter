package hayaa.database.center.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


/*
 * Description:
 * All Rights Reserved.
 * @version 1.0 2017/09/29 06:03  by  姓名 （邮箱前缀@cloud-young.com）创建
 */

public class TableExample extends BaseModel {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TableExample() {
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

	 public Criteria andTableidIsNull() {
            addCriterion("tableid is null");
            return (Criteria) this;
        }

        public Criteria andTableidIsNotNull() {
            addCriterion("tableid is not null");
            return (Criteria) this;
        }

        public Criteria andTableidEqualTo(Integer value) {
            addCriterion("tableid =", value, "Tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotEqualTo(Integer value) {
            addCriterion("tableid <>", value, "Tableid");
            return (Criteria) this;
        }

        public Criteria andTableidGreaterThan(Integer value) {
            addCriterion("tableid >", value, "Tableid");
            return (Criteria) this;
        }

        public Criteria andTableidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tableid >=", value, "Tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLessThan(Integer value) {
            addCriterion("tableid <", value, "Tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLessThanOrEqualTo(Integer value) {
            addCriterion("tableid <=", value, "Tableid");
            return (Criteria) this;
        }

        public Criteria andTableidIn(List<Integer> values) {
            addCriterion("tableid in", values, "Tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotIn(List<Integer> values) {
            addCriterion("tableid not in", values, "Tableid");
            return (Criteria) this;
        }

        public Criteria andTableidBetween(Integer value1, Integer value2) {
            addCriterion("tableid between", value1, value2, "Tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotBetween(Integer value1, Integer value2) {
            addCriterion("tableid not between", value1, value2, "Tableid");
            return (Criteria) this;
        } 

	 public Criteria andTablenameIsNull() {
            addCriterion("tablename is null");
            return (Criteria) this;
        }

        public Criteria andTablenameIsNotNull() {
            addCriterion("tablename is not null");
            return (Criteria) this;
        }

        public Criteria andTablenameEqualTo(String value) {
            addCriterion("tablename =", value, "Tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotEqualTo(String value) {
            addCriterion("tablename <>", value, "Tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameGreaterThan(String value) {
            addCriterion("tablename >", value, "Tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("tablename >=", value, "Tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLessThan(String value) {
            addCriterion("tablename <", value, "Tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLessThanOrEqualTo(String value) {
            addCriterion("tablename <=", value, "Tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameIn(List<String> values) {
            addCriterion("tablename in", values, "Tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotIn(List<String> values) {
            addCriterion("tablename not in", values, "Tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameBetween(String value1, String value2) {
            addCriterion("tablename between", value1, value2, "Tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotBetween(String value1, String value2) {
            addCriterion("tablename not between", value1, value2, "Tablename");
            return (Criteria) this;
        } 

	 public Criteria andTabletitleIsNull() {
            addCriterion("tabletitle is null");
            return (Criteria) this;
        }

        public Criteria andTabletitleIsNotNull() {
            addCriterion("tabletitle is not null");
            return (Criteria) this;
        }

        public Criteria andTabletitleEqualTo(String value) {
            addCriterion("tabletitle =", value, "Tabletitle");
            return (Criteria) this;
        }

        public Criteria andTabletitleNotEqualTo(String value) {
            addCriterion("tabletitle <>", value, "Tabletitle");
            return (Criteria) this;
        }

        public Criteria andTabletitleGreaterThan(String value) {
            addCriterion("tabletitle >", value, "Tabletitle");
            return (Criteria) this;
        }

        public Criteria andTabletitleGreaterThanOrEqualTo(String value) {
            addCriterion("tabletitle >=", value, "Tabletitle");
            return (Criteria) this;
        }

        public Criteria andTabletitleLessThan(String value) {
            addCriterion("tabletitle <", value, "Tabletitle");
            return (Criteria) this;
        }

        public Criteria andTabletitleLessThanOrEqualTo(String value) {
            addCriterion("tabletitle <=", value, "Tabletitle");
            return (Criteria) this;
        }

        public Criteria andTabletitleIn(List<String> values) {
            addCriterion("tabletitle in", values, "Tabletitle");
            return (Criteria) this;
        }

        public Criteria andTabletitleNotIn(List<String> values) {
            addCriterion("tabletitle not in", values, "Tabletitle");
            return (Criteria) this;
        }

        public Criteria andTabletitleBetween(String value1, String value2) {
            addCriterion("tabletitle between", value1, value2, "Tabletitle");
            return (Criteria) this;
        }

        public Criteria andTabletitleNotBetween(String value1, String value2) {
            addCriterion("tabletitle not between", value1, value2, "Tabletitle");
            return (Criteria) this;
        } 

	 public Criteria andTableremarkIsNull() {
            addCriterion("tableremark is null");
            return (Criteria) this;
        }

        public Criteria andTableremarkIsNotNull() {
            addCriterion("tableremark is not null");
            return (Criteria) this;
        }

        public Criteria andTableremarkEqualTo(String value) {
            addCriterion("tableremark =", value, "Tableremark");
            return (Criteria) this;
        }

        public Criteria andTableremarkNotEqualTo(String value) {
            addCriterion("tableremark <>", value, "Tableremark");
            return (Criteria) this;
        }

        public Criteria andTableremarkGreaterThan(String value) {
            addCriterion("tableremark >", value, "Tableremark");
            return (Criteria) this;
        }

        public Criteria andTableremarkGreaterThanOrEqualTo(String value) {
            addCriterion("tableremark >=", value, "Tableremark");
            return (Criteria) this;
        }

        public Criteria andTableremarkLessThan(String value) {
            addCriterion("tableremark <", value, "Tableremark");
            return (Criteria) this;
        }

        public Criteria andTableremarkLessThanOrEqualTo(String value) {
            addCriterion("tableremark <=", value, "Tableremark");
            return (Criteria) this;
        }

        public Criteria andTableremarkIn(List<String> values) {
            addCriterion("tableremark in", values, "Tableremark");
            return (Criteria) this;
        }

        public Criteria andTableremarkNotIn(List<String> values) {
            addCriterion("tableremark not in", values, "Tableremark");
            return (Criteria) this;
        }

        public Criteria andTableremarkBetween(String value1, String value2) {
            addCriterion("tableremark between", value1, value2, "Tableremark");
            return (Criteria) this;
        }

        public Criteria andTableremarkNotBetween(String value1, String value2) {
            addCriterion("tableremark not between", value1, value2, "Tableremark");
            return (Criteria) this;
        } 

	 public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "Createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "Createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "Createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "Createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "Createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "Createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "Createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "Createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "Createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "Createtime");
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