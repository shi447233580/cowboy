package com.cowboy.cowboy.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClerkInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClerkInfoExample() {
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

        public Criteria andClkIdIsNull() {
            addCriterion("clk_id is null");
            return (Criteria) this;
        }

        public Criteria andClkIdIsNotNull() {
            addCriterion("clk_id is not null");
            return (Criteria) this;
        }

        public Criteria andClkIdEqualTo(Long value) {
            addCriterion("clk_id =", value, "clkId");
            return (Criteria) this;
        }

        public Criteria andClkIdNotEqualTo(Long value) {
            addCriterion("clk_id <>", value, "clkId");
            return (Criteria) this;
        }

        public Criteria andClkIdGreaterThan(Long value) {
            addCriterion("clk_id >", value, "clkId");
            return (Criteria) this;
        }

        public Criteria andClkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("clk_id >=", value, "clkId");
            return (Criteria) this;
        }

        public Criteria andClkIdLessThan(Long value) {
            addCriterion("clk_id <", value, "clkId");
            return (Criteria) this;
        }

        public Criteria andClkIdLessThanOrEqualTo(Long value) {
            addCriterion("clk_id <=", value, "clkId");
            return (Criteria) this;
        }

        public Criteria andClkIdIn(List<Long> values) {
            addCriterion("clk_id in", values, "clkId");
            return (Criteria) this;
        }

        public Criteria andClkIdNotIn(List<Long> values) {
            addCriterion("clk_id not in", values, "clkId");
            return (Criteria) this;
        }

        public Criteria andClkIdBetween(Long value1, Long value2) {
            addCriterion("clk_id between", value1, value2, "clkId");
            return (Criteria) this;
        }

        public Criteria andClkIdNotBetween(Long value1, Long value2) {
            addCriterion("clk_id not between", value1, value2, "clkId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andHweightIsNull() {
            addCriterion("hweight is null");
            return (Criteria) this;
        }

        public Criteria andHweightIsNotNull() {
            addCriterion("hweight is not null");
            return (Criteria) this;
        }

        public Criteria andHweightEqualTo(String value) {
            addCriterion("hweight =", value, "hweight");
            return (Criteria) this;
        }

        public Criteria andHweightNotEqualTo(String value) {
            addCriterion("hweight <>", value, "hweight");
            return (Criteria) this;
        }

        public Criteria andHweightGreaterThan(String value) {
            addCriterion("hweight >", value, "hweight");
            return (Criteria) this;
        }

        public Criteria andHweightGreaterThanOrEqualTo(String value) {
            addCriterion("hweight >=", value, "hweight");
            return (Criteria) this;
        }

        public Criteria andHweightLessThan(String value) {
            addCriterion("hweight <", value, "hweight");
            return (Criteria) this;
        }

        public Criteria andHweightLessThanOrEqualTo(String value) {
            addCriterion("hweight <=", value, "hweight");
            return (Criteria) this;
        }

        public Criteria andHweightLike(String value) {
            addCriterion("hweight like", value, "hweight");
            return (Criteria) this;
        }

        public Criteria andHweightNotLike(String value) {
            addCriterion("hweight not like", value, "hweight");
            return (Criteria) this;
        }

        public Criteria andHweightIn(List<String> values) {
            addCriterion("hweight in", values, "hweight");
            return (Criteria) this;
        }

        public Criteria andHweightNotIn(List<String> values) {
            addCriterion("hweight not in", values, "hweight");
            return (Criteria) this;
        }

        public Criteria andHweightBetween(String value1, String value2) {
            addCriterion("hweight between", value1, value2, "hweight");
            return (Criteria) this;
        }

        public Criteria andHweightNotBetween(String value1, String value2) {
            addCriterion("hweight not between", value1, value2, "hweight");
            return (Criteria) this;
        }

        public Criteria andFaceIsNull() {
            addCriterion("face is null");
            return (Criteria) this;
        }

        public Criteria andFaceIsNotNull() {
            addCriterion("face is not null");
            return (Criteria) this;
        }

        public Criteria andFaceEqualTo(String value) {
            addCriterion("face =", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotEqualTo(String value) {
            addCriterion("face <>", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceGreaterThan(String value) {
            addCriterion("face >", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceGreaterThanOrEqualTo(String value) {
            addCriterion("face >=", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceLessThan(String value) {
            addCriterion("face <", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceLessThanOrEqualTo(String value) {
            addCriterion("face <=", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceLike(String value) {
            addCriterion("face like", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotLike(String value) {
            addCriterion("face not like", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceIn(List<String> values) {
            addCriterion("face in", values, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotIn(List<String> values) {
            addCriterion("face not in", values, "face");
            return (Criteria) this;
        }

        public Criteria andFaceBetween(String value1, String value2) {
            addCriterion("face between", value1, value2, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotBetween(String value1, String value2) {
            addCriterion("face not between", value1, value2, "face");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(String value) {
            addCriterion("style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(String value) {
            addCriterion("style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(String value) {
            addCriterion("style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(String value) {
            addCriterion("style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(String value) {
            addCriterion("style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(String value) {
            addCriterion("style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLike(String value) {
            addCriterion("style like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotLike(String value) {
            addCriterion("style not like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<String> values) {
            addCriterion("style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<String> values) {
            addCriterion("style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(String value1, String value2) {
            addCriterion("style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(String value1, String value2) {
            addCriterion("style not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andSlarartistsIsNull() {
            addCriterion("slarartists is null");
            return (Criteria) this;
        }

        public Criteria andSlarartistsIsNotNull() {
            addCriterion("slarartists is not null");
            return (Criteria) this;
        }

        public Criteria andSlarartistsEqualTo(String value) {
            addCriterion("slarartists =", value, "slarartists");
            return (Criteria) this;
        }

        public Criteria andSlarartistsNotEqualTo(String value) {
            addCriterion("slarartists <>", value, "slarartists");
            return (Criteria) this;
        }

        public Criteria andSlarartistsGreaterThan(String value) {
            addCriterion("slarartists >", value, "slarartists");
            return (Criteria) this;
        }

        public Criteria andSlarartistsGreaterThanOrEqualTo(String value) {
            addCriterion("slarartists >=", value, "slarartists");
            return (Criteria) this;
        }

        public Criteria andSlarartistsLessThan(String value) {
            addCriterion("slarartists <", value, "slarartists");
            return (Criteria) this;
        }

        public Criteria andSlarartistsLessThanOrEqualTo(String value) {
            addCriterion("slarartists <=", value, "slarartists");
            return (Criteria) this;
        }

        public Criteria andSlarartistsLike(String value) {
            addCriterion("slarartists like", value, "slarartists");
            return (Criteria) this;
        }

        public Criteria andSlarartistsNotLike(String value) {
            addCriterion("slarartists not like", value, "slarartists");
            return (Criteria) this;
        }

        public Criteria andSlarartistsIn(List<String> values) {
            addCriterion("slarartists in", values, "slarartists");
            return (Criteria) this;
        }

        public Criteria andSlarartistsNotIn(List<String> values) {
            addCriterion("slarartists not in", values, "slarartists");
            return (Criteria) this;
        }

        public Criteria andSlarartistsBetween(String value1, String value2) {
            addCriterion("slarartists between", value1, value2, "slarartists");
            return (Criteria) this;
        }

        public Criteria andSlarartistsNotBetween(String value1, String value2) {
            addCriterion("slarartists not between", value1, value2, "slarartists");
            return (Criteria) this;
        }

        public Criteria andBadHabitsIsNull() {
            addCriterion("Bad_habits is null");
            return (Criteria) this;
        }

        public Criteria andBadHabitsIsNotNull() {
            addCriterion("Bad_habits is not null");
            return (Criteria) this;
        }

        public Criteria andBadHabitsEqualTo(String value) {
            addCriterion("Bad_habits =", value, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsNotEqualTo(String value) {
            addCriterion("Bad_habits <>", value, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsGreaterThan(String value) {
            addCriterion("Bad_habits >", value, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsGreaterThanOrEqualTo(String value) {
            addCriterion("Bad_habits >=", value, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsLessThan(String value) {
            addCriterion("Bad_habits <", value, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsLessThanOrEqualTo(String value) {
            addCriterion("Bad_habits <=", value, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsLike(String value) {
            addCriterion("Bad_habits like", value, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsNotLike(String value) {
            addCriterion("Bad_habits not like", value, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsIn(List<String> values) {
            addCriterion("Bad_habits in", values, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsNotIn(List<String> values) {
            addCriterion("Bad_habits not in", values, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsBetween(String value1, String value2) {
            addCriterion("Bad_habits between", value1, value2, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsNotBetween(String value1, String value2) {
            addCriterion("Bad_habits not between", value1, value2, "badHabits");
            return (Criteria) this;
        }

        public Criteria andFavoriteFoodIsNull() {
            addCriterion("Favorite_food is null");
            return (Criteria) this;
        }

        public Criteria andFavoriteFoodIsNotNull() {
            addCriterion("Favorite_food is not null");
            return (Criteria) this;
        }

        public Criteria andFavoriteFoodEqualTo(String value) {
            addCriterion("Favorite_food =", value, "favoriteFood");
            return (Criteria) this;
        }

        public Criteria andFavoriteFoodNotEqualTo(String value) {
            addCriterion("Favorite_food <>", value, "favoriteFood");
            return (Criteria) this;
        }

        public Criteria andFavoriteFoodGreaterThan(String value) {
            addCriterion("Favorite_food >", value, "favoriteFood");
            return (Criteria) this;
        }

        public Criteria andFavoriteFoodGreaterThanOrEqualTo(String value) {
            addCriterion("Favorite_food >=", value, "favoriteFood");
            return (Criteria) this;
        }

        public Criteria andFavoriteFoodLessThan(String value) {
            addCriterion("Favorite_food <", value, "favoriteFood");
            return (Criteria) this;
        }

        public Criteria andFavoriteFoodLessThanOrEqualTo(String value) {
            addCriterion("Favorite_food <=", value, "favoriteFood");
            return (Criteria) this;
        }

        public Criteria andFavoriteFoodLike(String value) {
            addCriterion("Favorite_food like", value, "favoriteFood");
            return (Criteria) this;
        }

        public Criteria andFavoriteFoodNotLike(String value) {
            addCriterion("Favorite_food not like", value, "favoriteFood");
            return (Criteria) this;
        }

        public Criteria andFavoriteFoodIn(List<String> values) {
            addCriterion("Favorite_food in", values, "favoriteFood");
            return (Criteria) this;
        }

        public Criteria andFavoriteFoodNotIn(List<String> values) {
            addCriterion("Favorite_food not in", values, "favoriteFood");
            return (Criteria) this;
        }

        public Criteria andFavoriteFoodBetween(String value1, String value2) {
            addCriterion("Favorite_food between", value1, value2, "favoriteFood");
            return (Criteria) this;
        }

        public Criteria andFavoriteFoodNotBetween(String value1, String value2) {
            addCriterion("Favorite_food not between", value1, value2, "favoriteFood");
            return (Criteria) this;
        }

        public Criteria andSkillIsNull() {
            addCriterion("skill is null");
            return (Criteria) this;
        }

        public Criteria andSkillIsNotNull() {
            addCriterion("skill is not null");
            return (Criteria) this;
        }

        public Criteria andSkillEqualTo(String value) {
            addCriterion("skill =", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotEqualTo(String value) {
            addCriterion("skill <>", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillGreaterThan(String value) {
            addCriterion("skill >", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillGreaterThanOrEqualTo(String value) {
            addCriterion("skill >=", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLessThan(String value) {
            addCriterion("skill <", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLessThanOrEqualTo(String value) {
            addCriterion("skill <=", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLike(String value) {
            addCriterion("skill like", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotLike(String value) {
            addCriterion("skill not like", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillIn(List<String> values) {
            addCriterion("skill in", values, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotIn(List<String> values) {
            addCriterion("skill not in", values, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillBetween(String value1, String value2) {
            addCriterion("skill between", value1, value2, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotBetween(String value1, String value2) {
            addCriterion("skill not between", value1, value2, "skill");
            return (Criteria) this;
        }

        public Criteria andNCommentIsNull() {
            addCriterion("n_comment is null");
            return (Criteria) this;
        }

        public Criteria andNCommentIsNotNull() {
            addCriterion("n_comment is not null");
            return (Criteria) this;
        }

        public Criteria andNCommentEqualTo(String value) {
            addCriterion("n_comment =", value, "nComment");
            return (Criteria) this;
        }

        public Criteria andNCommentNotEqualTo(String value) {
            addCriterion("n_comment <>", value, "nComment");
            return (Criteria) this;
        }

        public Criteria andNCommentGreaterThan(String value) {
            addCriterion("n_comment >", value, "nComment");
            return (Criteria) this;
        }

        public Criteria andNCommentGreaterThanOrEqualTo(String value) {
            addCriterion("n_comment >=", value, "nComment");
            return (Criteria) this;
        }

        public Criteria andNCommentLessThan(String value) {
            addCriterion("n_comment <", value, "nComment");
            return (Criteria) this;
        }

        public Criteria andNCommentLessThanOrEqualTo(String value) {
            addCriterion("n_comment <=", value, "nComment");
            return (Criteria) this;
        }

        public Criteria andNCommentLike(String value) {
            addCriterion("n_comment like", value, "nComment");
            return (Criteria) this;
        }

        public Criteria andNCommentNotLike(String value) {
            addCriterion("n_comment not like", value, "nComment");
            return (Criteria) this;
        }

        public Criteria andNCommentIn(List<String> values) {
            addCriterion("n_comment in", values, "nComment");
            return (Criteria) this;
        }

        public Criteria andNCommentNotIn(List<String> values) {
            addCriterion("n_comment not in", values, "nComment");
            return (Criteria) this;
        }

        public Criteria andNCommentBetween(String value1, String value2) {
            addCriterion("n_comment between", value1, value2, "nComment");
            return (Criteria) this;
        }

        public Criteria andNCommentNotBetween(String value1, String value2) {
            addCriterion("n_comment not between", value1, value2, "nComment");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andNFileIsNull() {
            addCriterion("n_file is null");
            return (Criteria) this;
        }

        public Criteria andNFileIsNotNull() {
            addCriterion("n_file is not null");
            return (Criteria) this;
        }

        public Criteria andNFileEqualTo(String value) {
            addCriterion("n_file =", value, "nFile");
            return (Criteria) this;
        }

        public Criteria andNFileNotEqualTo(String value) {
            addCriterion("n_file <>", value, "nFile");
            return (Criteria) this;
        }

        public Criteria andNFileGreaterThan(String value) {
            addCriterion("n_file >", value, "nFile");
            return (Criteria) this;
        }

        public Criteria andNFileGreaterThanOrEqualTo(String value) {
            addCriterion("n_file >=", value, "nFile");
            return (Criteria) this;
        }

        public Criteria andNFileLessThan(String value) {
            addCriterion("n_file <", value, "nFile");
            return (Criteria) this;
        }

        public Criteria andNFileLessThanOrEqualTo(String value) {
            addCriterion("n_file <=", value, "nFile");
            return (Criteria) this;
        }

        public Criteria andNFileLike(String value) {
            addCriterion("n_file like", value, "nFile");
            return (Criteria) this;
        }

        public Criteria andNFileNotLike(String value) {
            addCriterion("n_file not like", value, "nFile");
            return (Criteria) this;
        }

        public Criteria andNFileIn(List<String> values) {
            addCriterion("n_file in", values, "nFile");
            return (Criteria) this;
        }

        public Criteria andNFileNotIn(List<String> values) {
            addCriterion("n_file not in", values, "nFile");
            return (Criteria) this;
        }

        public Criteria andNFileBetween(String value1, String value2) {
            addCriterion("n_file between", value1, value2, "nFile");
            return (Criteria) this;
        }

        public Criteria andNFileNotBetween(String value1, String value2) {
            addCriterion("n_file not between", value1, value2, "nFile");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andAttendanceAddressIsNull() {
            addCriterion("Attendance_address is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceAddressIsNotNull() {
            addCriterion("Attendance_address is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceAddressEqualTo(String value) {
            addCriterion("Attendance_address =", value, "attendanceAddress");
            return (Criteria) this;
        }

        public Criteria andAttendanceAddressNotEqualTo(String value) {
            addCriterion("Attendance_address <>", value, "attendanceAddress");
            return (Criteria) this;
        }

        public Criteria andAttendanceAddressGreaterThan(String value) {
            addCriterion("Attendance_address >", value, "attendanceAddress");
            return (Criteria) this;
        }

        public Criteria andAttendanceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Attendance_address >=", value, "attendanceAddress");
            return (Criteria) this;
        }

        public Criteria andAttendanceAddressLessThan(String value) {
            addCriterion("Attendance_address <", value, "attendanceAddress");
            return (Criteria) this;
        }

        public Criteria andAttendanceAddressLessThanOrEqualTo(String value) {
            addCriterion("Attendance_address <=", value, "attendanceAddress");
            return (Criteria) this;
        }

        public Criteria andAttendanceAddressLike(String value) {
            addCriterion("Attendance_address like", value, "attendanceAddress");
            return (Criteria) this;
        }

        public Criteria andAttendanceAddressNotLike(String value) {
            addCriterion("Attendance_address not like", value, "attendanceAddress");
            return (Criteria) this;
        }

        public Criteria andAttendanceAddressIn(List<String> values) {
            addCriterion("Attendance_address in", values, "attendanceAddress");
            return (Criteria) this;
        }

        public Criteria andAttendanceAddressNotIn(List<String> values) {
            addCriterion("Attendance_address not in", values, "attendanceAddress");
            return (Criteria) this;
        }

        public Criteria andAttendanceAddressBetween(String value1, String value2) {
            addCriterion("Attendance_address between", value1, value2, "attendanceAddress");
            return (Criteria) this;
        }

        public Criteria andAttendanceAddressNotBetween(String value1, String value2) {
            addCriterion("Attendance_address not between", value1, value2, "attendanceAddress");
            return (Criteria) this;
        }

        public Criteria andAttendanceAtimeIsNull() {
            addCriterion("Attendance_atime is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceAtimeIsNotNull() {
            addCriterion("Attendance_atime is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceAtimeEqualTo(String value) {
            addCriterion("Attendance_atime =", value, "attendanceAtime");
            return (Criteria) this;
        }

        public Criteria andAttendanceAtimeNotEqualTo(String value) {
            addCriterion("Attendance_atime <>", value, "attendanceAtime");
            return (Criteria) this;
        }

        public Criteria andAttendanceAtimeGreaterThan(String value) {
            addCriterion("Attendance_atime >", value, "attendanceAtime");
            return (Criteria) this;
        }

        public Criteria andAttendanceAtimeGreaterThanOrEqualTo(String value) {
            addCriterion("Attendance_atime >=", value, "attendanceAtime");
            return (Criteria) this;
        }

        public Criteria andAttendanceAtimeLessThan(String value) {
            addCriterion("Attendance_atime <", value, "attendanceAtime");
            return (Criteria) this;
        }

        public Criteria andAttendanceAtimeLessThanOrEqualTo(String value) {
            addCriterion("Attendance_atime <=", value, "attendanceAtime");
            return (Criteria) this;
        }

        public Criteria andAttendanceAtimeLike(String value) {
            addCriterion("Attendance_atime like", value, "attendanceAtime");
            return (Criteria) this;
        }

        public Criteria andAttendanceAtimeNotLike(String value) {
            addCriterion("Attendance_atime not like", value, "attendanceAtime");
            return (Criteria) this;
        }

        public Criteria andAttendanceAtimeIn(List<String> values) {
            addCriterion("Attendance_atime in", values, "attendanceAtime");
            return (Criteria) this;
        }

        public Criteria andAttendanceAtimeNotIn(List<String> values) {
            addCriterion("Attendance_atime not in", values, "attendanceAtime");
            return (Criteria) this;
        }

        public Criteria andAttendanceAtimeBetween(String value1, String value2) {
            addCriterion("Attendance_atime between", value1, value2, "attendanceAtime");
            return (Criteria) this;
        }

        public Criteria andAttendanceAtimeNotBetween(String value1, String value2) {
            addCriterion("Attendance_atime not between", value1, value2, "attendanceAtime");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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