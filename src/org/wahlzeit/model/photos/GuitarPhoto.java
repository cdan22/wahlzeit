package org.wahlzeit.model.photos;

import org.wahlzeit.model.Photo;
import org.wahlzeit.model.PhotoId;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by cdan on 18/11/14.
 */
public abstract class GuitarPhoto extends Photo {

    public static final String TYPE = "type";
    public static final String SHAPE = "shape";
    public static final String STRINGS = "strings";
    public static final String MATERIAL = "material";
    public static final String FRETS = "frets";
    public static final String FEATURES = "features";
    public static final String PICKUPS = "pickups";


    private GuitarType guitarType;
    private GuitarShape guitarShape;
    private GuitarStrings guitarStrings;
    private int frets;
    private String features;
    private int pickups;


    /**
     * @pre
     * @post
     * @methodtype constructor
     */
    public GuitarPhoto() {
        super();
    }


    /**
     * @pre
     * @post
     * @methodtype constructor
     */
    public GuitarPhoto(PhotoId myId) {
        super(myId);
    }


    /**
     * @pre
     * @post
     * @methodtype constructor
     */
    public GuitarPhoto(ResultSet rset) throws SQLException {
        super(rset);
    }


    /**
     * @pre
     * @post
     * @methodtype get
     */
    public GuitarStrings getGuitarStrings() {
        return guitarStrings;
    }


    /**
     * @pre
     * @post
     * @methodtype get
     */
    public GuitarType getGuitarType() {
        return guitarType;
    }


    /**
     * @pre guitarType != null
     * @post correct value set
     * @methodtype set
     */
    public void setGuitarType(GuitarType guitarType) {
        assert guitarType != null;
        this.guitarType = guitarType;
        assert this.guitarType == guitarType;
    }


    /**
     * @pre
     * @post
     * @methodtype get
     */
    public GuitarShape getGuitarShape() {
        return guitarShape;
    }


    /**
     * @pre guitarShape != null
     * @post correct value set
     * @methodtype set
     */
    public void setGuitarShape(GuitarShape guitarShape) {
        assert guitarShape != null;
        this.guitarShape = guitarShape;
        assert this.guitarShape == guitarShape;
    }


    /**
     * @pre guitarStrings != null
     * @post correct value set
     * @methodtype set
     */
    public void setGuitarStrings(GuitarStrings guitarStrings) {
        assert guitarStrings != null;
        this.guitarStrings = guitarStrings;
        assert this.guitarStrings == guitarStrings;
    }


    /**
     * @pre
     * @post
     * @methodtype get
     */
    public int getFrets() {
        return frets;
    }


    /**
     * @pre frets > 0
     * @post correct value set
     * @methodtype set
     */
    public void setFrets(int frets) {
        assert frets > 0;
        this.frets = frets;
        assert this.frets == frets;
    }


    /**
     * @pre
     * @post
     * @methodtype get
     */
    public String getFeatures() {
        return features;
    }


    /**
     * @pre features != null
     * @post correct value set
     * @methodtype set
     */
    public void setFeatures(String features) {
        assert features != null;
        this.features = features;
        assert this.features == features;
    }


    /**
     * @pre
     * @post
     * @methodtype get
     */
    public int getPickups() {
        return pickups;
    }


    /**
     * @pre pickups > 0
     * @post correct value set
     * @methodtype set
     */
    public void setPickups(int pickups) {
        assert pickups > 0;
        this.pickups = pickups;
        assert this.pickups == pickups;
    }


    /**
     * @pre
     * @post
     * @methodtype mutation
     */
    @Override
    public void readFrom(ResultSet rset) throws SQLException {
        super.readFrom(rset);
        //todo: read new attributes
    }


    /**
     * @pre
     * @post
     * @methodtype mutation
     */
    @Override
    public void writeOn(ResultSet rset) throws SQLException {
        super.writeOn(rset);
        //todo: write new attributes
    }
}
