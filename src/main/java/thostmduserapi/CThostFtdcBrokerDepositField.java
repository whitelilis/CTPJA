package thostmduserapi;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\u02bd\ufffd<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:3642</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thostmduserapi") 
public class CThostFtdcBrokerDepositField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(1) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(3) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\u03f4\u03bd\ufffd\ufffd\ufffd\u05fc\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(4) 
	public double PreBalance() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \ufffd\u03f4\u03bd\ufffd\ufffd\ufffd\u05fc\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(4) 
	public CThostFtdcBrokerDepositField PreBalance(double PreBalance) {
		this.io.setDoubleField(this, 4, PreBalance);
		return this;
	}
	/**
	 * \ufffd\ufffd\u01f0\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\u0736\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(5) 
	public double CurrMargin() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \ufffd\ufffd\u01f0\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\u0736\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(5) 
	public CThostFtdcBrokerDepositField CurrMargin(double CurrMargin) {
		this.io.setDoubleField(this, 5, CurrMargin);
		return this;
	}
	/**
	 * \u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(6) 
	public double CloseProfit() {
		return this.io.getDoubleField(this, 6);
	}
	/**
	 * \u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(6) 
	public CThostFtdcBrokerDepositField CloseProfit(double CloseProfit) {
		this.io.setDoubleField(this, 6, CloseProfit);
		return this;
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\ufffd\ufffd\u05fc\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(7) 
	public double Balance() {
		return this.io.getDoubleField(this, 7);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\ufffd\ufffd\u05fc\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(7) 
	public CThostFtdcBrokerDepositField Balance(double Balance) {
		this.io.setDoubleField(this, 7, Balance);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(8) 
	public double Deposit() {
		return this.io.getDoubleField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(8) 
	public CThostFtdcBrokerDepositField Deposit(double Deposit) {
		this.io.setDoubleField(this, 8, Deposit);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(9) 
	public double Withdraw() {
		return this.io.getDoubleField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(9) 
	public CThostFtdcBrokerDepositField Withdraw(double Withdraw) {
		this.io.setDoubleField(this, 9, Withdraw);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(10) 
	public double Available() {
		return this.io.getDoubleField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(10) 
	public CThostFtdcBrokerDepositField Available(double Available) {
		this.io.setDoubleField(this, 10, Available);
		return this;
	}
	/**
	 * \ufffd\ufffd\u05fc\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(11) 
	public double Reserve() {
		return this.io.getDoubleField(this, 11);
	}
	/**
	 * \ufffd\ufffd\u05fc\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(11) 
	public CThostFtdcBrokerDepositField Reserve(double Reserve) {
		this.io.setDoubleField(this, 11, Reserve);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(12) 
	public double FrozenMargin() {
		return this.io.getDoubleField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(12) 
	public CThostFtdcBrokerDepositField FrozenMargin(double FrozenMargin) {
		this.io.setDoubleField(this, 12, FrozenMargin);
		return this;
	}
	public CThostFtdcBrokerDepositField() {
		super();
	}
	public CThostFtdcBrokerDepositField(Pointer pointer) {
		super(pointer);
	}
}