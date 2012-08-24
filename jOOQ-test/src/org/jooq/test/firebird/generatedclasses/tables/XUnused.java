/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class XUnused extends org.jooq.impl.TableImpl<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord> {

	private static final long serialVersionUID = -1006548203;

	/**
	 * The singleton instance of X_UNUSED
	 */
	public static final org.jooq.test.firebird.generatedclasses.tables.XUnused X_UNUSED = new org.jooq.test.firebird.generatedclasses.tables.XUnused();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord> getRecordType() {
		return org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord.class;
	}

	/**
	 * The table column <code>X_UNUSED.ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>X_UNUSED.NAME</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>X_UNUSED.BIG_INTEGER</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord, java.lang.Long> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>X_UNUSED.ID_REF</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID_REF = createField("ID_REF", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>X_UNUSED.CLASS</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CLASS = createField("CLASS", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>X_UNUSED.FIELDS</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> FIELDS = createField("FIELDS", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>X_UNUSED.CONFIGURATION</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CONFIGURATION = createField("CONFIGURATION", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>X_UNUSED.U_D_T</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> U_D_T = createField("U_D_T", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>X_UNUSED.META_DATA</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> META_DATA = createField("META_DATA", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>X_UNUSED.TYPE0</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> TYPE0 = createField("TYPE0", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>X_UNUSED.PRIMARY_KEY</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARY_KEY = createField("PRIMARY_KEY", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>X_UNUSED.PRIMARYKEY</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARYKEY = createField("PRIMARYKEY", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>X_UNUSED.NAME_REF</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME_REF = createField("NAME_REF", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>X_UNUSED.FIELD 737</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord, java.lang.Long> FIELD_737 = createField("FIELD 737", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>X_UNUSED.CONNECTION</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CONNECTION = createField("CONNECTION", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>X_UNUSED.PREPARED_STATEMENT</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PREPARED_STATEMENT = createField("PREPARED_STATEMENT", org.jooq.impl.SQLDataType.INTEGER, this);

	public XUnused() {
		super("X_UNUSED");
	}

	public XUnused(java.lang.String alias) {
		super(alias, null, org.jooq.test.firebird.generatedclasses.tables.XUnused.X_UNUSED);
	}

	@Override
	public org.jooq.test.firebird.generatedclasses.tables.XUnused as(java.lang.String alias) {
		return new org.jooq.test.firebird.generatedclasses.tables.XUnused(alias);
	}
}