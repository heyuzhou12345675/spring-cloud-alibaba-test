package com.zcy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppDeHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppDeHistoryExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCArticleIdIsNull() {
            addCriterion("c_article_id is null");
            return (Criteria) this;
        }

        public Criteria andCArticleIdIsNotNull() {
            addCriterion("c_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andCArticleIdEqualTo(String value) {
            addCriterion("c_article_id =", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdNotEqualTo(String value) {
            addCriterion("c_article_id <>", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdGreaterThan(String value) {
            addCriterion("c_article_id >", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_article_id >=", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdLessThan(String value) {
            addCriterion("c_article_id <", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdLessThanOrEqualTo(String value) {
            addCriterion("c_article_id <=", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdLike(String value) {
            addCriterion("c_article_id like", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdNotLike(String value) {
            addCriterion("c_article_id not like", value, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdIn(List<String> values) {
            addCriterion("c_article_id in", values, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdNotIn(List<String> values) {
            addCriterion("c_article_id not in", values, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdBetween(String value1, String value2) {
            addCriterion("c_article_id between", value1, value2, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCArticleIdNotBetween(String value1, String value2) {
            addCriterion("c_article_id not between", value1, value2, "cArticleId");
            return (Criteria) this;
        }

        public Criteria andCUserIdIsNull() {
            addCriterion("c_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCUserIdIsNotNull() {
            addCriterion("c_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCUserIdEqualTo(String value) {
            addCriterion("c_user_id =", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotEqualTo(String value) {
            addCriterion("c_user_id <>", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThan(String value) {
            addCriterion("c_user_id >", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_user_id >=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThan(String value) {
            addCriterion("c_user_id <", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThanOrEqualTo(String value) {
            addCriterion("c_user_id <=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLike(String value) {
            addCriterion("c_user_id like", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotLike(String value) {
            addCriterion("c_user_id not like", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdIn(List<String> values) {
            addCriterion("c_user_id in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotIn(List<String> values) {
            addCriterion("c_user_id not in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdBetween(String value1, String value2) {
            addCriterion("c_user_id between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotBetween(String value1, String value2) {
            addCriterion("c_user_id not between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCTitleIsNull() {
            addCriterion("c_title is null");
            return (Criteria) this;
        }

        public Criteria andCTitleIsNotNull() {
            addCriterion("c_title is not null");
            return (Criteria) this;
        }

        public Criteria andCTitleEqualTo(String value) {
            addCriterion("c_title =", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotEqualTo(String value) {
            addCriterion("c_title <>", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleGreaterThan(String value) {
            addCriterion("c_title >", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleGreaterThanOrEqualTo(String value) {
            addCriterion("c_title >=", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleLessThan(String value) {
            addCriterion("c_title <", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleLessThanOrEqualTo(String value) {
            addCriterion("c_title <=", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleLike(String value) {
            addCriterion("c_title like", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotLike(String value) {
            addCriterion("c_title not like", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleIn(List<String> values) {
            addCriterion("c_title in", values, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotIn(List<String> values) {
            addCriterion("c_title not in", values, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleBetween(String value1, String value2) {
            addCriterion("c_title between", value1, value2, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotBetween(String value1, String value2) {
            addCriterion("c_title not between", value1, value2, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCNewHttpIsNull() {
            addCriterion("c_new_http is null");
            return (Criteria) this;
        }

        public Criteria andCNewHttpIsNotNull() {
            addCriterion("c_new_http is not null");
            return (Criteria) this;
        }

        public Criteria andCNewHttpEqualTo(String value) {
            addCriterion("c_new_http =", value, "cNewHttp");
            return (Criteria) this;
        }

        public Criteria andCNewHttpNotEqualTo(String value) {
            addCriterion("c_new_http <>", value, "cNewHttp");
            return (Criteria) this;
        }

        public Criteria andCNewHttpGreaterThan(String value) {
            addCriterion("c_new_http >", value, "cNewHttp");
            return (Criteria) this;
        }

        public Criteria andCNewHttpGreaterThanOrEqualTo(String value) {
            addCriterion("c_new_http >=", value, "cNewHttp");
            return (Criteria) this;
        }

        public Criteria andCNewHttpLessThan(String value) {
            addCriterion("c_new_http <", value, "cNewHttp");
            return (Criteria) this;
        }

        public Criteria andCNewHttpLessThanOrEqualTo(String value) {
            addCriterion("c_new_http <=", value, "cNewHttp");
            return (Criteria) this;
        }

        public Criteria andCNewHttpLike(String value) {
            addCriterion("c_new_http like", value, "cNewHttp");
            return (Criteria) this;
        }

        public Criteria andCNewHttpNotLike(String value) {
            addCriterion("c_new_http not like", value, "cNewHttp");
            return (Criteria) this;
        }

        public Criteria andCNewHttpIn(List<String> values) {
            addCriterion("c_new_http in", values, "cNewHttp");
            return (Criteria) this;
        }

        public Criteria andCNewHttpNotIn(List<String> values) {
            addCriterion("c_new_http not in", values, "cNewHttp");
            return (Criteria) this;
        }

        public Criteria andCNewHttpBetween(String value1, String value2) {
            addCriterion("c_new_http between", value1, value2, "cNewHttp");
            return (Criteria) this;
        }

        public Criteria andCNewHttpNotBetween(String value1, String value2) {
            addCriterion("c_new_http not between", value1, value2, "cNewHttp");
            return (Criteria) this;
        }

        public Criteria andCChannelIsNull() {
            addCriterion("c_channel is null");
            return (Criteria) this;
        }

        public Criteria andCChannelIsNotNull() {
            addCriterion("c_channel is not null");
            return (Criteria) this;
        }

        public Criteria andCChannelEqualTo(String value) {
            addCriterion("c_channel =", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelNotEqualTo(String value) {
            addCriterion("c_channel <>", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelGreaterThan(String value) {
            addCriterion("c_channel >", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelGreaterThanOrEqualTo(String value) {
            addCriterion("c_channel >=", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelLessThan(String value) {
            addCriterion("c_channel <", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelLessThanOrEqualTo(String value) {
            addCriterion("c_channel <=", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelLike(String value) {
            addCriterion("c_channel like", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelNotLike(String value) {
            addCriterion("c_channel not like", value, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelIn(List<String> values) {
            addCriterion("c_channel in", values, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelNotIn(List<String> values) {
            addCriterion("c_channel not in", values, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelBetween(String value1, String value2) {
            addCriterion("c_channel between", value1, value2, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCChannelNotBetween(String value1, String value2) {
            addCriterion("c_channel not between", value1, value2, "cChannel");
            return (Criteria) this;
        }

        public Criteria andCLanguageIsNull() {
            addCriterion("c_language is null");
            return (Criteria) this;
        }

        public Criteria andCLanguageIsNotNull() {
            addCriterion("c_language is not null");
            return (Criteria) this;
        }

        public Criteria andCLanguageEqualTo(String value) {
            addCriterion("c_language =", value, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageNotEqualTo(String value) {
            addCriterion("c_language <>", value, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageGreaterThan(String value) {
            addCriterion("c_language >", value, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("c_language >=", value, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageLessThan(String value) {
            addCriterion("c_language <", value, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageLessThanOrEqualTo(String value) {
            addCriterion("c_language <=", value, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageLike(String value) {
            addCriterion("c_language like", value, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageNotLike(String value) {
            addCriterion("c_language not like", value, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageIn(List<String> values) {
            addCriterion("c_language in", values, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageNotIn(List<String> values) {
            addCriterion("c_language not in", values, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageBetween(String value1, String value2) {
            addCriterion("c_language between", value1, value2, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCLanguageNotBetween(String value1, String value2) {
            addCriterion("c_language not between", value1, value2, "cLanguage");
            return (Criteria) this;
        }

        public Criteria andCMenuIdIsNull() {
            addCriterion("c_menu_id is null");
            return (Criteria) this;
        }

        public Criteria andCMenuIdIsNotNull() {
            addCriterion("c_menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andCMenuIdEqualTo(String value) {
            addCriterion("c_menu_id =", value, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdNotEqualTo(String value) {
            addCriterion("c_menu_id <>", value, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdGreaterThan(String value) {
            addCriterion("c_menu_id >", value, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_menu_id >=", value, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdLessThan(String value) {
            addCriterion("c_menu_id <", value, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdLessThanOrEqualTo(String value) {
            addCriterion("c_menu_id <=", value, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdLike(String value) {
            addCriterion("c_menu_id like", value, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdNotLike(String value) {
            addCriterion("c_menu_id not like", value, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdIn(List<String> values) {
            addCriterion("c_menu_id in", values, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdNotIn(List<String> values) {
            addCriterion("c_menu_id not in", values, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdBetween(String value1, String value2) {
            addCriterion("c_menu_id between", value1, value2, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCMenuIdNotBetween(String value1, String value2) {
            addCriterion("c_menu_id not between", value1, value2, "cMenuId");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNull() {
            addCriterion("c_type is null");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNotNull() {
            addCriterion("c_type is not null");
            return (Criteria) this;
        }

        public Criteria andCTypeEqualTo(String value) {
            addCriterion("c_type =", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotEqualTo(String value) {
            addCriterion("c_type <>", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThan(String value) {
            addCriterion("c_type >", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_type >=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThan(String value) {
            addCriterion("c_type <", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThanOrEqualTo(String value) {
            addCriterion("c_type <=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLike(String value) {
            addCriterion("c_type like", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotLike(String value) {
            addCriterion("c_type not like", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeIn(List<String> values) {
            addCriterion("c_type in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotIn(List<String> values) {
            addCriterion("c_type not in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeBetween(String value1, String value2) {
            addCriterion("c_type between", value1, value2, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotBetween(String value1, String value2) {
            addCriterion("c_type not between", value1, value2, "cType");
            return (Criteria) this;
        }

        public Criteria andTTimeIsNull() {
            addCriterion("t_time is null");
            return (Criteria) this;
        }

        public Criteria andTTimeIsNotNull() {
            addCriterion("t_time is not null");
            return (Criteria) this;
        }

        public Criteria andTTimeEqualTo(Date value) {
            addCriterion("t_time =", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeNotEqualTo(Date value) {
            addCriterion("t_time <>", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeGreaterThan(Date value) {
            addCriterion("t_time >", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_time >=", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeLessThan(Date value) {
            addCriterion("t_time <", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeLessThanOrEqualTo(Date value) {
            addCriterion("t_time <=", value, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeIn(List<Date> values) {
            addCriterion("t_time in", values, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeNotIn(List<Date> values) {
            addCriterion("t_time not in", values, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeBetween(Date value1, Date value2) {
            addCriterion("t_time between", value1, value2, "tTime");
            return (Criteria) this;
        }

        public Criteria andTTimeNotBetween(Date value1, Date value2) {
            addCriterion("t_time not between", value1, value2, "tTime");
            return (Criteria) this;
        }

        public Criteria andCCountryIsNull() {
            addCriterion("c_country is null");
            return (Criteria) this;
        }

        public Criteria andCCountryIsNotNull() {
            addCriterion("c_country is not null");
            return (Criteria) this;
        }

        public Criteria andCCountryEqualTo(String value) {
            addCriterion("c_country =", value, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryNotEqualTo(String value) {
            addCriterion("c_country <>", value, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryGreaterThan(String value) {
            addCriterion("c_country >", value, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryGreaterThanOrEqualTo(String value) {
            addCriterion("c_country >=", value, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryLessThan(String value) {
            addCriterion("c_country <", value, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryLessThanOrEqualTo(String value) {
            addCriterion("c_country <=", value, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryLike(String value) {
            addCriterion("c_country like", value, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryNotLike(String value) {
            addCriterion("c_country not like", value, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryIn(List<String> values) {
            addCriterion("c_country in", values, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryNotIn(List<String> values) {
            addCriterion("c_country not in", values, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryBetween(String value1, String value2) {
            addCriterion("c_country between", value1, value2, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCCountryNotBetween(String value1, String value2) {
            addCriterion("c_country not between", value1, value2, "cCountry");
            return (Criteria) this;
        }

        public Criteria andCLinkCountIsNull() {
            addCriterion("c_link_count is null");
            return (Criteria) this;
        }

        public Criteria andCLinkCountIsNotNull() {
            addCriterion("c_link_count is not null");
            return (Criteria) this;
        }

        public Criteria andCLinkCountEqualTo(String value) {
            addCriterion("c_link_count =", value, "cLinkCount");
            return (Criteria) this;
        }

        public Criteria andCLinkCountNotEqualTo(String value) {
            addCriterion("c_link_count <>", value, "cLinkCount");
            return (Criteria) this;
        }

        public Criteria andCLinkCountGreaterThan(String value) {
            addCriterion("c_link_count >", value, "cLinkCount");
            return (Criteria) this;
        }

        public Criteria andCLinkCountGreaterThanOrEqualTo(String value) {
            addCriterion("c_link_count >=", value, "cLinkCount");
            return (Criteria) this;
        }

        public Criteria andCLinkCountLessThan(String value) {
            addCriterion("c_link_count <", value, "cLinkCount");
            return (Criteria) this;
        }

        public Criteria andCLinkCountLessThanOrEqualTo(String value) {
            addCriterion("c_link_count <=", value, "cLinkCount");
            return (Criteria) this;
        }

        public Criteria andCLinkCountLike(String value) {
            addCriterion("c_link_count like", value, "cLinkCount");
            return (Criteria) this;
        }

        public Criteria andCLinkCountNotLike(String value) {
            addCriterion("c_link_count not like", value, "cLinkCount");
            return (Criteria) this;
        }

        public Criteria andCLinkCountIn(List<String> values) {
            addCriterion("c_link_count in", values, "cLinkCount");
            return (Criteria) this;
        }

        public Criteria andCLinkCountNotIn(List<String> values) {
            addCriterion("c_link_count not in", values, "cLinkCount");
            return (Criteria) this;
        }

        public Criteria andCLinkCountBetween(String value1, String value2) {
            addCriterion("c_link_count between", value1, value2, "cLinkCount");
            return (Criteria) this;
        }

        public Criteria andCLinkCountNotBetween(String value1, String value2) {
            addCriterion("c_link_count not between", value1, value2, "cLinkCount");
            return (Criteria) this;
        }

        public Criteria andAppChannelUrlIsNull() {
            addCriterion("app_channel_url is null");
            return (Criteria) this;
        }

        public Criteria andAppChannelUrlIsNotNull() {
            addCriterion("app_channel_url is not null");
            return (Criteria) this;
        }

        public Criteria andAppChannelUrlEqualTo(String value) {
            addCriterion("app_channel_url =", value, "appChannelUrl");
            return (Criteria) this;
        }

        public Criteria andAppChannelUrlNotEqualTo(String value) {
            addCriterion("app_channel_url <>", value, "appChannelUrl");
            return (Criteria) this;
        }

        public Criteria andAppChannelUrlGreaterThan(String value) {
            addCriterion("app_channel_url >", value, "appChannelUrl");
            return (Criteria) this;
        }

        public Criteria andAppChannelUrlGreaterThanOrEqualTo(String value) {
            addCriterion("app_channel_url >=", value, "appChannelUrl");
            return (Criteria) this;
        }

        public Criteria andAppChannelUrlLessThan(String value) {
            addCriterion("app_channel_url <", value, "appChannelUrl");
            return (Criteria) this;
        }

        public Criteria andAppChannelUrlLessThanOrEqualTo(String value) {
            addCriterion("app_channel_url <=", value, "appChannelUrl");
            return (Criteria) this;
        }

        public Criteria andAppChannelUrlLike(String value) {
            addCriterion("app_channel_url like", value, "appChannelUrl");
            return (Criteria) this;
        }

        public Criteria andAppChannelUrlNotLike(String value) {
            addCriterion("app_channel_url not like", value, "appChannelUrl");
            return (Criteria) this;
        }

        public Criteria andAppChannelUrlIn(List<String> values) {
            addCriterion("app_channel_url in", values, "appChannelUrl");
            return (Criteria) this;
        }

        public Criteria andAppChannelUrlNotIn(List<String> values) {
            addCriterion("app_channel_url not in", values, "appChannelUrl");
            return (Criteria) this;
        }

        public Criteria andAppChannelUrlBetween(String value1, String value2) {
            addCriterion("app_channel_url between", value1, value2, "appChannelUrl");
            return (Criteria) this;
        }

        public Criteria andAppChannelUrlNotBetween(String value1, String value2) {
            addCriterion("app_channel_url not between", value1, value2, "appChannelUrl");
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