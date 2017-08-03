package com.personal.skyAngel.domain.cost;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.personal.skyAngel.domain.base.IdBestEntity;

@Entity
@Table(name = "cost")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "cost_sequence")
public class Cost extends IdBestEntity {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /** 保教费 */
    private String teachingFees;

    /** 生活费 */
    private String livingExpenses;

    /** 晚餐费 */
    private String dinnerFee;

    /** 保险费 */
    private String insurance;

    /** 门禁卡 */
    private String entranceGuardCard;

    /** 书包 */
    private String schoolBag;

    /** 床上用品 */
    private String beddingArticle;

    /** 运动服（外套） */
    private String sportsCoat;

    /** 运动服（裤子） */
    private String sportsPants;

    /** 礼服（女）--外套 */
    private String dressGirlCoat;

    /** 礼服（女）--衬衣 */
    private String dressGirlShirt;

    /** 礼服（女）--裙子 */
    private String dressGirlSkirt;

    /** 礼服（男）--外套 */
    private String dressBoyCoat;

    /** 礼服（男）--衬衣 */
    private String dressBoyShirt;

    /** 礼服（男）--背心 */
    private String dressBoyVest;

    /** 礼服（男）--裤子 */
    private String dressBoyPants;

    public Cost() {
    }

    public Cost(String teachingFees, String livingExpenses, String dinnerFee, String insurance,
            String entranceGuardCard, String schoolBag, String beddingArticle, String sportsCoat, String sportsPants,
            String dressGirlCoat, String dressGirlShirt, String dressGirlSkirt, String dressBoyCoat,
            String dressBoyShirt, String dressBoyVest, String dressBoyPants) {
        super();
        this.teachingFees = teachingFees;
        this.livingExpenses = livingExpenses;
        this.dinnerFee = dinnerFee;
        this.insurance = insurance;
        this.entranceGuardCard = entranceGuardCard;
        this.schoolBag = schoolBag;
        this.beddingArticle = beddingArticle;
        this.sportsCoat = sportsCoat;
        this.sportsPants = sportsPants;
        this.dressGirlCoat = dressGirlCoat;
        this.dressGirlShirt = dressGirlShirt;
        this.dressGirlSkirt = dressGirlSkirt;
        this.dressBoyCoat = dressBoyCoat;
        this.dressBoyShirt = dressBoyShirt;
        this.dressBoyVest = dressBoyVest;
        this.dressBoyPants = dressBoyPants;
    }

    @JsonProperty
    public String getTeachingFees() {
        return teachingFees;
    }

    public void setTeachingFees(String teachingFees) {
        this.teachingFees = teachingFees;
    }

    @JsonProperty
    public String getLivingExpenses() {
        return livingExpenses;
    }

    public void setLivingExpenses(String livingExpenses) {
        this.livingExpenses = livingExpenses;
    }

    @JsonProperty
    public String getDinnerFee() {
        return dinnerFee;
    }

    public void setDinnerFee(String dinnerFee) {
        this.dinnerFee = dinnerFee;
    }

    @JsonProperty
    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    @JsonProperty
    public String getEntranceGuardCard() {
        return entranceGuardCard;
    }

    public void setEntranceGuardCard(String entranceGuardCard) {
        this.entranceGuardCard = entranceGuardCard;
    }

    @JsonProperty
    public String getSchoolBag() {
        return schoolBag;
    }

    public void setSchoolBag(String schoolBag) {
        this.schoolBag = schoolBag;
    }

    @JsonProperty
    public String getBeddingArticle() {
        return beddingArticle;
    }

    public void setBeddingArticle(String beddingArticle) {
        this.beddingArticle = beddingArticle;
    }

    @JsonProperty
    public String getSportsCoat() {
        return sportsCoat;
    }

    public void setSportsCoat(String sportsCoat) {
        this.sportsCoat = sportsCoat;
    }

    @JsonProperty
    public String getSportsPants() {
        return sportsPants;
    }

    public void setSportsPants(String sportsPants) {
        this.sportsPants = sportsPants;
    }

    @JsonProperty
    public String getDressGirlCoat() {
        return dressGirlCoat;
    }

    public void setDressGirlCoat(String dressGirlCoat) {
        this.dressGirlCoat = dressGirlCoat;
    }

    @JsonProperty
    public String getDressGirlShirt() {
        return dressGirlShirt;
    }

    public void setDressGirlShirt(String dressGirlShirt) {
        this.dressGirlShirt = dressGirlShirt;
    }

    @JsonProperty
    public String getDressGirlSkirt() {
        return dressGirlSkirt;
    }

    public void setDressGirlSkirt(String dressGirlSkirt) {
        this.dressGirlSkirt = dressGirlSkirt;
    }

    @JsonProperty
    public String getDressBoyCoat() {
        return dressBoyCoat;
    }

    public void setDressBoyCoat(String dressBoyCoat) {
        this.dressBoyCoat = dressBoyCoat;
    }

    @JsonProperty
    public String getDressBoyShirt() {
        return dressBoyShirt;
    }

    public void setDressBoyShirt(String dressBoyShirt) {
        this.dressBoyShirt = dressBoyShirt;
    }

    @JsonProperty
    public String getDressBoyVest() {
        return dressBoyVest;
    }

    public void setDressBoyVest(String dressBoyVest) {
        this.dressBoyVest = dressBoyVest;
    }

    @JsonProperty
    public String getDressBoyPants() {
        return dressBoyPants;
    }

    public void setDressBoyPants(String dressBoyPants) {
        this.dressBoyPants = dressBoyPants;
    }

}
