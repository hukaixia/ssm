package jmu.hkx.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RevertExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RevertExample() {
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andRevertidIsNull() {
            addCriterion("revertID is null");
            return (Criteria) this;
        }

        public Criteria andRevertidIsNotNull() {
            addCriterion("revertID is not null");
            return (Criteria) this;
        }

        public Criteria andRevertidEqualTo(Integer value) {
            addCriterion("revertID =", value, "revertid");
            return (Criteria) this;
        }

        public Criteria andRevertidNotEqualTo(Integer value) {
            addCriterion("revertID <>", value, "revertid");
            return (Criteria) this;
        }

        public Criteria andRevertidGreaterThan(Integer value) {
            addCriterion("revertID >", value, "revertid");
            return (Criteria) this;
        }

        public Criteria andRevertidGreaterThanOrEqualTo(Integer value) {
            addCriterion("revertID >=", value, "revertid");
            return (Criteria) this;
        }

        public Criteria andRevertidLessThan(Integer value) {
            addCriterion("revertID <", value, "revertid");
            return (Criteria) this;
        }

        public Criteria andRevertidLessThanOrEqualTo(Integer value) {
            addCriterion("revertID <=", value, "revertid");
            return (Criteria) this;
        }

        public Criteria andRevertidIn(List<Integer> values) {
            addCriterion("revertID in", values, "revertid");
            return (Criteria) this;
        }

        public Criteria andRevertidNotIn(List<Integer> values) {
            addCriterion("revertID not in", values, "revertid");
            return (Criteria) this;
        }

        public Criteria andRevertidBetween(Integer value1, Integer value2) {
            addCriterion("revertID between", value1, value2, "revertid");
            return (Criteria) this;
        }

        public Criteria andRevertidNotBetween(Integer value1, Integer value2) {
            addCriterion("revertID not between", value1, value2, "revertid");
            return (Criteria) this;
        }

        public Criteria andRevertcontentIsNull() {
            addCriterion("revertContent is null");
            return (Criteria) this;
        }

        public Criteria andRevertcontentIsNotNull() {
            addCriterion("revertContent is not null");
            return (Criteria) this;
        }

        public Criteria andRevertcontentEqualTo(String value) {
            addCriterion("revertContent =", value, "revertcontent");
            return (Criteria) this;
        }

        public Criteria andRevertcontentNotEqualTo(String value) {
            addCriterion("revertContent <>", value, "revertcontent");
            return (Criteria) this;
        }

        public Criteria andRevertcontentGreaterThan(String value) {
            addCriterion("revertContent >", value, "revertcontent");
            return (Criteria) this;
        }

        public Criteria andRevertcontentGreaterThanOrEqualTo(String value) {
            addCriterion("revertContent >=", value, "revertcontent");
            return (Criteria) this;
        }

        public Criteria andRevertcontentLessThan(String value) {
            addCriterion("revertContent <", value, "revertcontent");
            return (Criteria) this;
        }

        public Criteria andRevertcontentLessThanOrEqualTo(String value) {
            addCriterion("revertContent <=", value, "revertcontent");
            return (Criteria) this;
        }

        public Criteria andRevertcontentLike(String value) {
            addCriterion("revertContent like", value, "revertcontent");
            return (Criteria) this;
        }

        public Criteria andRevertcontentNotLike(String value) {
            addCriterion("revertContent not like", value, "revertcontent");
            return (Criteria) this;
        }

        public Criteria andRevertcontentIn(List<String> values) {
            addCriterion("revertContent in", values, "revertcontent");
            return (Criteria) this;
        }

        public Criteria andRevertcontentNotIn(List<String> values) {
            addCriterion("revertContent not in", values, "revertcontent");
            return (Criteria) this;
        }

        public Criteria andRevertcontentBetween(String value1, String value2) {
            addCriterion("revertContent between", value1, value2, "revertcontent");
            return (Criteria) this;
        }

        public Criteria andRevertcontentNotBetween(String value1, String value2) {
            addCriterion("revertContent not between", value1, value2, "revertcontent");
            return (Criteria) this;
        }

        public Criteria andWritedateIsNull() {
            addCriterion("writeDate is null");
            return (Criteria) this;
        }

        public Criteria andWritedateIsNotNull() {
            addCriterion("writeDate is not null");
            return (Criteria) this;
        }

        public Criteria andWritedateEqualTo(Date value) {
            addCriterion("writeDate =", value, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateNotEqualTo(Date value) {
            addCriterion("writeDate <>", value, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateGreaterThan(Date value) {
            addCriterion("writeDate >", value, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateGreaterThanOrEqualTo(Date value) {
            addCriterion("writeDate >=", value, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateLessThan(Date value) {
            addCriterion("writeDate <", value, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateLessThanOrEqualTo(Date value) {
            addCriterion("writeDate <=", value, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateIn(List<Date> values) {
            addCriterion("writeDate in", values, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateNotIn(List<Date> values) {
            addCriterion("writeDate not in", values, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateBetween(Date value1, Date value2) {
            addCriterion("writeDate between", value1, value2, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateNotBetween(Date value1, Date value2) {
            addCriterion("writeDate not between", value1, value2, "writedate");
            return (Criteria) this;
        }

        public Criteria andMessageidIsNull() {
            addCriterion("messageID is null");
            return (Criteria) this;
        }

        public Criteria andMessageidIsNotNull() {
            addCriterion("messageID is not null");
            return (Criteria) this;
        }

        public Criteria andMessageidEqualTo(Integer value) {
            addCriterion("messageID =", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotEqualTo(Integer value) {
            addCriterion("messageID <>", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThan(Integer value) {
            addCriterion("messageID >", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("messageID >=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThan(Integer value) {
            addCriterion("messageID <", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThanOrEqualTo(Integer value) {
            addCriterion("messageID <=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidIn(List<Integer> values) {
            addCriterion("messageID in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotIn(List<Integer> values) {
            addCriterion("messageID not in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidBetween(Integer value1, Integer value2) {
            addCriterion("messageID between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotBetween(Integer value1, Integer value2) {
            addCriterion("messageID not between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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