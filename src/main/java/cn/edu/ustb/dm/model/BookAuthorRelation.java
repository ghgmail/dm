package cn.edu.ustb.dm.model;

public class BookAuthorRelation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_author_relation.BOOK_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    private Integer BOOK_ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_author_relation.AUTHOR_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    private Integer AUTHOR_ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_author_relation.AUTHOR_TYPE_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    private Integer AUTHOR_TYPE_ID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_author_relation.BOOK_ID
     *
     * @return the value of book_author_relation.BOOK_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public Integer getBOOK_ID() {
        return BOOK_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_author_relation.BOOK_ID
     *
     * @param BOOK_ID the value for book_author_relation.BOOK_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public void setBOOK_ID(Integer BOOK_ID) {
        this.BOOK_ID = BOOK_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_author_relation.AUTHOR_ID
     *
     * @return the value of book_author_relation.AUTHOR_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public Integer getAUTHOR_ID() {
        return AUTHOR_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_author_relation.AUTHOR_ID
     *
     * @param AUTHOR_ID the value for book_author_relation.AUTHOR_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public void setAUTHOR_ID(Integer AUTHOR_ID) {
        this.AUTHOR_ID = AUTHOR_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_author_relation.AUTHOR_TYPE_ID
     *
     * @return the value of book_author_relation.AUTHOR_TYPE_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public Integer getAUTHOR_TYPE_ID() {
        return AUTHOR_TYPE_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_author_relation.AUTHOR_TYPE_ID
     *
     * @param AUTHOR_TYPE_ID the value for book_author_relation.AUTHOR_TYPE_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public void setAUTHOR_TYPE_ID(Integer AUTHOR_TYPE_ID) {
        this.AUTHOR_TYPE_ID = AUTHOR_TYPE_ID;
    }
}