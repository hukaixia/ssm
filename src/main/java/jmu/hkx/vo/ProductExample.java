package jmu.hkx.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductidIsNull() {
            addCriterion("productID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productID not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductbrandIsNull() {
            addCriterion("productBrand is null");
            return (Criteria) this;
        }

        public Criteria andProductbrandIsNotNull() {
            addCriterion("productBrand is not null");
            return (Criteria) this;
        }

        public Criteria andProductbrandEqualTo(String value) {
            addCriterion("productBrand =", value, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandNotEqualTo(String value) {
            addCriterion("productBrand <>", value, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandGreaterThan(String value) {
            addCriterion("productBrand >", value, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandGreaterThanOrEqualTo(String value) {
            addCriterion("productBrand >=", value, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandLessThan(String value) {
            addCriterion("productBrand <", value, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandLessThanOrEqualTo(String value) {
            addCriterion("productBrand <=", value, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandLike(String value) {
            addCriterion("productBrand like", value, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandNotLike(String value) {
            addCriterion("productBrand not like", value, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandIn(List<String> values) {
            addCriterion("productBrand in", values, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandNotIn(List<String> values) {
            addCriterion("productBrand not in", values, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandBetween(String value1, String value2) {
            addCriterion("productBrand between", value1, value2, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductbrandNotBetween(String value1, String value2) {
            addCriterion("productBrand not between", value1, value2, "productbrand");
            return (Criteria) this;
        }

        public Criteria andProductmodelIsNull() {
            addCriterion("productModel is null");
            return (Criteria) this;
        }

        public Criteria andProductmodelIsNotNull() {
            addCriterion("productModel is not null");
            return (Criteria) this;
        }

        public Criteria andProductmodelEqualTo(String value) {
            addCriterion("productModel =", value, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelNotEqualTo(String value) {
            addCriterion("productModel <>", value, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelGreaterThan(String value) {
            addCriterion("productModel >", value, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelGreaterThanOrEqualTo(String value) {
            addCriterion("productModel >=", value, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelLessThan(String value) {
            addCriterion("productModel <", value, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelLessThanOrEqualTo(String value) {
            addCriterion("productModel <=", value, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelLike(String value) {
            addCriterion("productModel like", value, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelNotLike(String value) {
            addCriterion("productModel not like", value, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelIn(List<String> values) {
            addCriterion("productModel in", values, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelNotIn(List<String> values) {
            addCriterion("productModel not in", values, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelBetween(String value1, String value2) {
            addCriterion("productModel between", value1, value2, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductmodelNotBetween(String value1, String value2) {
            addCriterion("productModel not between", value1, value2, "productmodel");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNull() {
            addCriterion("productPrice is null");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNotNull() {
            addCriterion("productPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductpriceEqualTo(BigDecimal value) {
            addCriterion("productPrice =", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotEqualTo(BigDecimal value) {
            addCriterion("productPrice <>", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThan(BigDecimal value) {
            addCriterion("productPrice >", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("productPrice >=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThan(BigDecimal value) {
            addCriterion("productPrice <", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("productPrice <=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceIn(List<BigDecimal> values) {
            addCriterion("productPrice in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotIn(List<BigDecimal> values) {
            addCriterion("productPrice not in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productPrice between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productPrice not between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductimageIsNull() {
            addCriterion("productImage is null");
            return (Criteria) this;
        }

        public Criteria andProductimageIsNotNull() {
            addCriterion("productImage is not null");
            return (Criteria) this;
        }

        public Criteria andProductimageEqualTo(String value) {
            addCriterion("productImage =", value, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageNotEqualTo(String value) {
            addCriterion("productImage <>", value, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageGreaterThan(String value) {
            addCriterion("productImage >", value, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageGreaterThanOrEqualTo(String value) {
            addCriterion("productImage >=", value, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageLessThan(String value) {
            addCriterion("productImage <", value, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageLessThanOrEqualTo(String value) {
            addCriterion("productImage <=", value, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageLike(String value) {
            addCriterion("productImage like", value, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageNotLike(String value) {
            addCriterion("productImage not like", value, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageIn(List<String> values) {
            addCriterion("productImage in", values, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageNotIn(List<String> values) {
            addCriterion("productImage not in", values, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageBetween(String value1, String value2) {
            addCriterion("productImage between", value1, value2, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductimageNotBetween(String value1, String value2) {
            addCriterion("productImage not between", value1, value2, "productimage");
            return (Criteria) this;
        }

        public Criteria andProductdesIsNull() {
            addCriterion("productDes is null");
            return (Criteria) this;
        }

        public Criteria andProductdesIsNotNull() {
            addCriterion("productDes is not null");
            return (Criteria) this;
        }

        public Criteria andProductdesEqualTo(String value) {
            addCriterion("productDes =", value, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesNotEqualTo(String value) {
            addCriterion("productDes <>", value, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesGreaterThan(String value) {
            addCriterion("productDes >", value, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesGreaterThanOrEqualTo(String value) {
            addCriterion("productDes >=", value, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesLessThan(String value) {
            addCriterion("productDes <", value, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesLessThanOrEqualTo(String value) {
            addCriterion("productDes <=", value, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesLike(String value) {
            addCriterion("productDes like", value, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesNotLike(String value) {
            addCriterion("productDes not like", value, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesIn(List<String> values) {
            addCriterion("productDes in", values, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesNotIn(List<String> values) {
            addCriterion("productDes not in", values, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesBetween(String value1, String value2) {
            addCriterion("productDes between", value1, value2, "productdes");
            return (Criteria) this;
        }

        public Criteria andProductdesNotBetween(String value1, String value2) {
            addCriterion("productDes not between", value1, value2, "productdes");
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