package com.http.util;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTool {
	/**
	 * 第一季度的开始时间 月日
	 */
	public static final String FIRST_QUARTER_BEGINDATE = "01-01";
	/**
	 * 第一季度的结束时间 月日
	 */
	public static final String FIRST_QUARTER_ENDDATE = "03-31";
	/**
	 * 第二季度的开始时间 月日
	 */
	public static final String SECOND_QUARTER_BEGINDATE = "04-01";
	/**
	 * 第二季度的结束时间 月日
	 */
	public static final String SECOND_QUARTER_ENDDATE = "06-30";
	/**
	 * 第三季度的开始时间 月日
	 */
	public static final String THIRD_QUARTER_BEGINDATE = "07-01";
	/**
	 * 第三季度的结束时间 月日
	 */
	public static final String THIRD_QUARTER_ENDDATE = "09-30";
	/**
	 * 第4季度的开始时间 月日
	 */
	public static final String FOURTH_QUARTER_BEGINDATE = "10-01";
	/**
	 * 第4季度的结束时间 月日
	 */
	public static final String FOURTH_QUARTER_ENDDATE = "12-31";
	
	
	/**
	 * 第1月的开始时间 月日
	 */
	public static final String FIRST_MONTH_BEGINDATE = "01-01";
	/**
	 * 第1月的结束时间 月日
	 */
	public static final String FIRST_MONTH_ENDDATE = "01-31";
	/**
	 * 第2月的开始时间 月日
	 */
	public static final String SECOND_MONTH_BEGINDATE = "02-01";
	/**
	 * 第2月的结束时间 月日
	 */
	public static final String SECOND_MONTH_ENDDATE1 = "02-28";
	public static final String SECOND_MONTH_ENDDATE2 = "02-29";
	/**
	 * 第3月的开始时间 月日
	 */
	public static final String THIRD_MONTH_BEGINDATE = "03-01";
	/**
	 * 第3月的结束时间 月日
	 */
	public static final String THIRD_MONTH_ENDDATE = "03-31";
	/**
	 * 第4月的开始时间 月日
	 */
	public static final String FOURTH_MONTH_BEGINDATE = "04-01";
	/**
	 * 第4月的结束时间 月日
	 */
	public static final String FOURTH_MONTH_ENDDATE = "04-30";
	/**
	 * 第5月的开始时间 月日
	 */
	public static final String FIVE_MONTH_BEGINDATE = "05-01";
	/**
	 * 第5月的结束时间 月日
	 */
	public static final String FIVE_MONTH_ENDDATE = "05-31";
	/**
	 * 第6月的开始时间 月日
	 */
	public static final String SIX_MONTH_BEGINDATE = "06-01";
	/**
	 * 第6月的结束时间 月日
	 */
	public static final String SIX_MONTH_ENDDATE = "06-30";
	/**
	 * 第7月的开始时间 月日
	 */
	public static final String SEVEN_MONTH_BEGINDATE = "07-01";
	/**
	 * 第7月的结束时间 月日
	 */
	public static final String SEVEN_MONTH_ENDDATE = "07-31";
	/**
	 * 第8月的开始时间 月日
	 */
	public static final String EIGHT_MONTH_BEGINDATE = "08-01";
	/**
	 * 第8月的结束时间 月日
	 */
	public static final String EIGHT_MONTH_ENDDATE = "08-31";
	/**
	 * 第9月的开始时间 月日
	 */
	public static final String NINE_MONTH_BEGINDATE = "09-01";
	/**
	 * 第9月的结束时间 月日
	 */
	public static final String NINE_MONTH_ENDDATE = "09-30";
	/**
	 * 第10月的开始时间 月日
	 */
	public static final String TEN_MONTH_BEGINDATE = "10-01";
	/**
	 * 第10月的结束时间 月日
	 */
	public static final String TEN_MONTH_ENDDATE = "10-30";
	/**
	 * 第11月的开始时间 月日
	 */
	public static final String ELEVEN_MONTH_BEGINDATE = "11-01";
	/**
	 * 第11月的结束时间 月日
	 */
	public static final String ELEVEN_MONTH_ENDDATE = "11-30";
	/**
	 * 第12月的开始时间 月日
	 */
	public static final String TWELVE_MONTH_BEGINDATE = "12-01";
	/**
	 * 第12月的结束时间 月日
	 */
	public static final String TWELVE_MONTH_ENDDATE = "12-31";
	
	/**
	 * 
	  * @Title:        getToday
	  * @Description:  TODO 获取当前日期  格式  2014-09-16
	  * @param:        @return   
	  * @return:       String   
	  * @throws
	  * @author        huxl
	  * @Date          2014年9月16日 下午3:52:34
	 */
	public static String getToday() {
		Date dt = new java.util.Date();
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(dt);
	}

	public static String parseDates(Date dt) {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(dt);
	}

	public static String parseDates2(Date dt) {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(dt);
	}

	public static String parseDates3(Date dt) {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");
		return sdf.format(dt);
	}

	public static String parseDates4(Date dt) {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMdd");
		return sdf.format(dt);
	}

	public static String parseDates5(Date dt) {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		return sdf.format(dt);
	}

	public static String strintToDateString(String ds) throws ParseException {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMdd");
		Date d = sdf.parse(ds);
		sdf = new java.text.SimpleDateFormat("yyyy年MM月dd日");
		return sdf.format(d);
	}

	public static String strintToDateString1(String ds) throws ParseException {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(ds);
		sdf = new java.text.SimpleDateFormat("yyyyMMdd");
		return sdf.format(d);
	}


	public static String strintToDateString2(String ds) throws ParseException {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMdd");
		Date d = sdf.parse(ds);
		sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(d);
	}

	public static String strintToDateString3(String ds) throws ParseException {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
		Date d = sdf.parse(ds);
		sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(d);
	}

	public static String strintToDateString4(String ds) throws ParseException {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(ds);
		sdf = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(d);
	}

	public static String strintToDateString5(String ds) throws ParseException {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
		Date d = sdf.parse(ds);
		sdf = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm");
		return sdf.format(d);
	}

	public static String strintToDateString6(String ds) throws ParseException {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
		Date d = sdf.parse(ds);
		sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(d);
	}
	
	public static String strintToDateString7(String ds) throws ParseException {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("HHmm");
		Date d = sdf.parse(ds);
		sdf = new java.text.SimpleDateFormat("HH:mm");
		return sdf.format(d);
	}
	
	public static String strintToDateString8(String ds) throws ParseException {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm");
		Date d = sdf.parse(ds);
		sdf = new java.text.SimpleDateFormat("HHmm");
		return sdf.format(d);
	}
	
	public static String strintToDateString9(String ds) throws ParseException {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(ds);
		sdf = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(d);
	}
	/**
	 * 时间处理
	 * 
	 * @param dt
	 * @return "yyyy-MM-dd"格式
	 */
	public static String parseDate(Date dt) {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(dt);
	}
	public static String parseDate2(Date dt) {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(dt);
	}
	public static String parseDate3(Date dt) {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("HHmm");
		return sdf.format(dt);
	}
	public static String parseDategk(Date dt) {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMM");
		return sdf.format(dt);
	}

	public static Date strintToDate(String ds) throws ParseException {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(ds);
		return d;
	}

	public static Date strintToDate1(String ds) throws ParseException {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMdd");
		Date d = sdf.parse(ds);
		return d;
	}

	public static Date strintTotime() {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");
		Date d = null;
		try {
			d = sdf.parse(DateTool.getTime("HH:mm:ss"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}

	public static Date strintToDatetime(String ds) throws ParseException {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(ds);
		return d;
	}

	public static String getDayAfter(Date d, int dayAfter) throws ParseException {
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.DAY_OF_MONTH, dayAfter);
		Date dt = new Date(c.get(Calendar.YEAR) - 1900, c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
		return DateTool.parseDate(dt);
	}

	public static String getminuteAfter(Date d, int dayAfter) throws ParseException {
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.MINUTE, dayAfter);
		Date dt = new Date(c.get(Calendar.YEAR) - 1900, c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH),
				c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND));
		return DateTool.parseDates(dt);
	}

	public static Date getminuteAfters(Date d, int dayAfter) throws ParseException {
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.MINUTE, dayAfter);
		Date dt = new Date(c.get(Calendar.YEAR) - 1900, c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH),
				c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND));
		return dt;
	}

	public static String getDayAfterMonth(Date d, int monthAfter) {
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.MONTH, monthAfter);
		Date dt = new Date(c.get(Calendar.YEAR) - 1900, c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
		return DateTool.parseDate(dt);
	}

	public static String getDayAfterMonthforgk(Date d, int monthAfter) {
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.MONTH, monthAfter);
		Date dt = new Date(c.get(Calendar.YEAR) - 1900, c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
		return DateTool.parseDategk(dt);
	}

	public static String getFirstDayOfMonth(Date d) {
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.set(Calendar.DAY_OF_MONTH, 1);
		Date dt = new Date(c.get(Calendar.YEAR) - 1900, c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
		return DateTool.parseDate(dt);
	}

	// 根据传入的type进行转换日期，type必须遵循Date转换的规则
	public static String getTime(String type) {
		Date dt = new java.util.Date();
		SimpleDateFormat sdf = new java.text.SimpleDateFormat(type);
		return sdf.format(dt);
	}

	public static int getDay(String d) {
		int day = 1;
		if (d.length() >= 10) {
			day = Integer.parseInt(d.substring(8, 10));
		}
		return day;
	}

	public static int getMonth(String d) {
		int m = 1;
		if (d.length() >= 10) {
			m = Integer.parseInt(d.substring(5, 7));
		}
		return m;
	}

	public static int getYear(String d) {
		int y = 1;
		if (d.length() >= 10) {
			y = Integer.parseInt(d.substring(0, 4));
		}
		return y;
	}

	// 根据传入的两个日期计算相差秒数
	public static long getDaySecond(Date c1, Date c2) {
		long iReturn = 0;
		if (c1 != null && c2 != null) {
			iReturn = (long) ((c2.getTime() - c1.getTime()) / 1000);
		}
		return iReturn;
	}

	// 根据传入的两个日期计算相差小时
	public static long getDayHous(Date c1, Date c2) {
		long iReturn = 0;
		if (c1 != null && c2 != null) {
			iReturn = (long) ((c2.getTime() - c1.getTime()) / (60 * 60 * 1000));
		}
		return iReturn;
	}

	// 根据传入的两个日期计算相差天数
	public static int getDayBetween(Calendar c1, Calendar c2) {
		int iReturn = 0;
		if (c1 != null && c2 != null) {
			iReturn = (int) ((c2.getTimeInMillis() - c1.getTimeInMillis()) / (24 * 60 * 60 * 1000));
		}
		return iReturn;
	}

	// 根据传入的两个日期计算相差年数
	public static int getYearBetween(Calendar c1, Calendar c2) {
		int iReturn = 0;
		if (c1 != null && c2 != null) {
			iReturn = (int) (getDayBetween(c1, c2) / 365);
		}
		return iReturn;
	}

	/**
	 * 两个时间相差距离多少天多少小时多少分多少秒
	 * 
	 * @param str1
	 *            时间参数 1 格式：1990-01-01 12:00:00
	 * @param str2
	 *            时间参数 2 格式：2009-01-01 12:00:00
	 * @return String 返回值为：xx天xx小时xx分xx秒
	 */
	public static String getDistanceTime(Date one, Date two) {
		if (one == null || two == null) {
			return null;
		}
		long day = 0;
		long hour = 0;
		long min = 0;
		long sec = 0;
		try {

			long time1 = one.getTime();
			long time2 = two.getTime();
			long diff;
			if (time1 < time2) {
				diff = time2 - time1;
			} else {
				diff = time1 - time2;
			}
			day = diff / (24 * 60 * 60 * 1000);
			hour = (diff / (60 * 60 * 1000) - day * 24);
			min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);
			sec = (diff / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return day + "天" + hour + "小时" + min + "分" + sec + "秒";
	}

	/**
	 * 把2005-02-5这样的日期格式转化为Calendar类型
	 * 
	 * @param stringTo
	 * @return
	 * @throws ParseException
	 */
	public static Calendar stringToCalendar(String stringTo) throws ParseException {
		Calendar c = Calendar.getInstance();
		if (stringTo != null) {
			SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
			Date d = sdf.parse(stringTo);
			c.setTime(d);
		}
		return c;
	}

	/**
	 * 把2005年02月5日12:12:12这样的日期格式转化为Calendar类型
	 * 
	 * @param stringTo
	 * @return
	 * @throws ParseException
	 */
	public static Calendar StringToCalendar(String stringTo) throws ParseException {
		Calendar c = Calendar.getInstance();
		if (stringTo != null) {
			SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
			Date d = sdf.parse(stringTo);
			c.setTime(d);
		}
		return c;
	}

	public static String getNextMonday(String s) throws ParseException {
		Calendar c = DateTool.stringToCalendar(s);
		return (DateTool.getDayAfter(DateTool.strintToDate(s), 7 - c.get(Calendar.DAY_OF_WEEK) + 2));
	}

	public static String getNextSunday(String s) throws ParseException {
		Calendar c = DateTool.stringToCalendar(s);
		return (DateTool.getDayAfter(DateTool.strintToDate(s), 7 - c.get(Calendar.DAY_OF_WEEK) + 2 + 7));
	}

	public static String getThisSaturday(String s) throws ParseException {
		Calendar c = DateTool.stringToCalendar(s);
		return (DateTool.getDayAfter(DateTool.strintToDate(s), 7 - c.get(Calendar.DAY_OF_WEEK)));
	}

	public static String getWeekOfYear(String s) throws ParseException {
		Calendar c = DateTool.stringToCalendar(s);
		return String.valueOf(c.get(Calendar.WEEK_OF_YEAR));

	}

	public static String getNow() {
		return DateTool.getTime("yyyy-MM-dd HH:mm:ss");
	}

	public static String getNowTime() {
		return DateTool.getTime("HH:mm:ss");
	}

	// 获得本周的第一天
	public static String getMondayOFWeek() throws ParseException {
		int mondayPlus = DateTool.getMondayPlus();
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.add(GregorianCalendar.DATE, mondayPlus);
		Date monday = currentDate.getTime();

		DateFormat df = DateFormat.getDateInstance();
		String preMonday = df.format(monday);
		return preMonday;
	}

	private static int getMondayPlus() throws ParseException {
		Calendar cd = Calendar.getInstance();
		// 获得今天是一周的第几天，星期日是第一天，星期二是第二天......
		int dayOfWeek = cd.get(Calendar.DAY_OF_WEEK) - 1; // 因为按中国礼拜一作为第一天所以这里减1
		if (dayOfWeek == 1) {
			return 0;
		} else {
			return 1 - dayOfWeek;
		}
	}

	// 获得本周的最后一天
	public static String getCurrentWeekday() throws ParseException {
		int mondayPlus = DateTool.getMondayPlus();
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.add(GregorianCalendar.DATE, mondayPlus + 6);
		Date monday = currentDate.getTime();

		DateFormat df = DateFormat.getDateInstance();
		String preMonday = df.format(monday);
		return preMonday;
	}

	// 获得上周星期一的日期
	public static String getPreviousWeekday() throws ParseException {
		int weeks = 0;
		weeks--;
		int mondayPlus = DateTool.getMondayPlus();
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.add(GregorianCalendar.DATE, mondayPlus + 7 * weeks);
		Date monday = currentDate.getTime();
		DateFormat df = DateFormat.getDateInstance();
		String preMonday = df.format(monday);
		return preMonday;
	}

	// 获得上周星期日的日期
	public static String getPreviousWeekSunday() throws ParseException {
		int weeks = 0;
		weeks--;
		int mondayPlus = DateTool.getMondayPlus();
		GregorianCalendar currentDate = new GregorianCalendar();
		currentDate.add(GregorianCalendar.DATE, mondayPlus + weeks);
		Date monday = currentDate.getTime();
		DateFormat df = DateFormat.getDateInstance();
		String preMonday = df.format(monday);
		return preMonday;
	}

	/**
	 * 判断是否润年
	 * 
	 * @param ddate
	 * @return
	 */
	public static boolean isLeapYear(String ddate) {
		/**
		 * 详细设计： 1.被400整除是闰年，否则： 2.不能被4整除则不是闰年 3.能被4整除同时不能被100整除则是闰年
		 * 3.能被4整除同时能被100整除则不是闰年
		 */
		Date d = new Date();
		GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
		gc.setTime(d);
		int year = gc.get(Calendar.YEAR);
		if ((year % 400) == 0)
			return true;
		else if ((year % 4) == 0) {
			if ((year % 100) == 0)
				return false;
			else
				return true;
		} else
			return false;
	}

	/**
	 * 获取一个月的最后一天
	 * 
	 * @param dat
	 * @return
	 */

	public static String getEndDateOfMonth(String dat) {// yyyy-MM-dd
		String str = dat.substring(0, 8);
		String month = dat.substring(5, 7);
		int mon = Integer.parseInt(month);
		if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) {
			str += "31";
		} else if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
			str += "30";
		} else {
			if (isLeapYear(dat)) {
				str += "29";
			} else {
				str += "28";
			}
		}
		return str;
	}

	// 获取当月第一天
	public static String getFirstDayOfMonth() {
		String str = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Calendar lastDate = Calendar.getInstance();
		lastDate.set(Calendar.DATE, 1);// 设为当前月的1号
		str = sdf.format(lastDate.getTime());
		return str;
	}

	// 获取输入时间月份的第一天
	public static String getFirstDayOfOutMonth(String strDate) {
		strDate = strDate.replaceAll("-", "");
		String str = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Calendar lastDate = Calendar.getInstance();
		lastDate.set(Calendar.YEAR, Integer.valueOf(strDate.substring(0, 4)));  
		lastDate.set(Calendar.MONTH, Integer.valueOf(strDate.substring(4, 6))-1);  
		lastDate.set(Calendar.DATE, 1);// 设为当前月的1号
		str = sdf.format(lastDate.getTime());
		return str;
	}
	
	
	/**
	 * 
	 * @desc 获取昨日
	 * @return
	 */
	public static String getYesterday(){
		Date d=new Date(System.currentTimeMillis()-1000*60*60*24);
		SimpleDateFormat sp=new SimpleDateFormat("yyyy-MM-dd");
		String yesterday = sp.format(d);//获取昨天日期
		return yesterday;
	}
	
	
	// 计算当月最后一天,返回字符串
	public static String getDefaultDay() {
		String str = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Calendar lastDate = Calendar.getInstance();
		lastDate.set(Calendar.DATE, 1);// 设为当前月的1号
		lastDate.add(Calendar.MONTH, 1);// 加一个月，变为下月的1号
		lastDate.add(Calendar.DATE, -1);// 减去一天，变为当月最后一天

		str = sdf.format(lastDate.getTime());
		return str;
	}

	// 计算前一天,返回字符串
	public static String getForWardDay() {
		String str = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Calendar lastDate = Calendar.getInstance();
		lastDate.add(Calendar.DATE, -1);// 减去一天

		str = sdf.format(lastDate.getTime());
		return str;
	}

	public static Date strintToDatetime1(String ds) throws ParseException {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");
		Date d = sdf.parse(ds);
		return d;
	}

	/**
	 * 日期计算处理方法 接受参数比如：200912，200901 返回值为201001，200902
	 * 
	 * @param date
	 * @return
	 */
	public long dateaccount(long date) {
		long d = date;
		String dateTemp = Long.toString(d);
		String yearStr = dateTemp.substring(0, 4);
		String monthStr = dateTemp.substring(4, dateTemp.length());
		long year = Long.parseLong(yearStr);
		long month = Long.parseLong(monthStr);
		if (month == 12) {
			yearStr = Long.toString(year + 1);
			monthStr = "01";
			dateTemp = yearStr + monthStr;
			d = Long.parseLong(dateTemp);
		} else {
			d++;
		}
		return d;
	}

	// 计算前30天,返回字符串
	public static Date getForthirtyDay(Date date, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, -day);// 减去一天
		return calendar.getTime();
	}

	// 返回前一个月
	public static Date getForthirtyMonth(Date date, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, -day);// 减去一天
		return calendar.getTime();
	}

	// 获取当天年月日时分秒
	public static String getNowCalTime() {
		String time = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		time = sdf.format(date);
		return time;
	}

	public static String myPercent(long y, long z) {
		String baifenbi = "";// 接受百分比的值
		double baiy = y * 1.0;
		double baiz = z * 1.0;
		double fen = baiy / baiz;
		// NumberFormat nf = NumberFormat.getPercentInstance(); 注释掉的也是一种方法
		// nf.setMinimumFractionDigits( 2 ); 保留到小数点后几位
		DecimalFormat df1 = new DecimalFormat("##.00%"); // ##.00%
															// 百分比格式，后面不足2位的用0补齐
		// baifenbi=nf.format(fen);
		baifenbi = df1.format(fen);
		return baifenbi;
	}

	public static String doubleToDian(Double d) {
		String parten = "#.##";
		DecimalFormat decimal = new DecimalFormat(parten);
		String str = decimal.format(d);
		return str;
	}

	public static double forToFive(double d) {
		return Double.valueOf(new BigDecimal(d).setScale(2, BigDecimal.ROUND_HALF_UP).toString()).doubleValue();
	}

	/**
	 * 预约时间计算，2013-09-07
	 * 
	 * @param args
	 * @throws ParseException
	 */
	public static String getMarkDate(Date nowDate) {
		if (null != nowDate && !nowDate.equals("")) {
			Calendar c = Calendar.getInstance();
			c.setTime(nowDate);
			// 是否在4点以前
			if (nowDate.getHours() > 15) {
				c.set(Calendar.DATE, nowDate.getDate() + 2);
			} else {
				c.set(Calendar.DATE, nowDate.getDate() + 1);
			}
			return new SimpleDateFormat("yyyyMMdd").format(c.getTime());
		}
		return null;
	}

	/**
	 * 
	 * @MethodName: oneYearsTime
	 * @Description: 获取一年后的今天
	 * @author: yangwu
	 * @param: @param fmt
	 * @param: @return
	 * @return: String
	 * @version: V1.0
	 * @Date: 2014年3月31日 下午3:45:59
	 */
	public static String oneYearsTime(String dateStr) {

		int year = Integer.parseInt(dateStr.substring(0, 4));
		int month = Integer.parseInt(dateStr.substring(4, 6));
		int day = Integer.parseInt(dateStr.substring(6, 8));

		Calendar cal = Calendar.getInstance();
		cal.set(year + 1, month, day);
		Date date = cal.getTime();
		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}

	/**
	 * 
	 * @Title: getCurrentQuarter
	 * @Description: TODO 获取当前季度
	 * @param: @return
	 * @return: String
	 * @throws
	 * @author huxl
	 * @Date 2014年5月23日 下午3:58:46
	 */
	public static String getCurrentQuarter() {
		Calendar c = Calendar.getInstance();
		int currentMonth = c.get(Calendar.MONTH) + 1;
		if (currentMonth >= 1 && currentMonth <= 3)
			return "一";
		else if (currentMonth >= 4 && currentMonth <= 6)
			return "二";
		else if (currentMonth >= 7 && currentMonth <= 9)
			return "三";
		else if (currentMonth >= 10 && currentMonth <= 12)
			return "四";
		return "一";
	}

	/**
	 * 
	 * @Title: getCurrentQuarterStartTime
	 * @Description: TODO 当前季度的开始时间
	 * @param: @return
	 * @return: Date
	 * @throws
	 * @author huxl
	 * @Date 2014年5月23日 上午8:45:52
	 */
	public static Date getCurrentQuarterStartTime() {
		SimpleDateFormat longSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat shortSdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		int currentMonth = c.get(Calendar.MONTH) + 1;
		Date now = null;
		try {
			if (currentMonth >= 1 && currentMonth <= 3)
				c.set(Calendar.MONTH, 0);
			else if (currentMonth >= 4 && currentMonth <= 6)
				c.set(Calendar.MONTH, 3);
			else if (currentMonth >= 7 && currentMonth <= 9)
				c.set(Calendar.MONTH, 4);
			else if (currentMonth >= 10 && currentMonth <= 12)
				c.set(Calendar.MONTH, 9);
			c.set(Calendar.DATE, 1);
			now = longSdf.parse(shortSdf.format(c.getTime()) + " 00:00:00");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return now;
	}

	/**
	 * 
	 * @Title: getCurrentQuarterEndTime
	 * @Description: TODO 当前季度的结束时间
	 * @param: @return
	 * @return: Date
	 * @throws
	 * @author huxl
	 * @Date 2014年5月23日 上午8:50:06
	 */
	public static Date getCurrentQuarterEndTime() {
		SimpleDateFormat longSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat shortSdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		int currentMonth = c.get(Calendar.MONTH) + 1;
		Date now = null;
		try {
			if (currentMonth >= 1 && currentMonth <= 3) {
				c.set(Calendar.MONTH, 2);
				c.set(Calendar.DATE, 31);
			} else if (currentMonth >= 4 && currentMonth <= 6) {
				c.set(Calendar.MONTH, 5);
				c.set(Calendar.DATE, 30);
			} else if (currentMonth >= 7 && currentMonth <= 9) {
				c.set(Calendar.MONTH, 8);
				c.set(Calendar.DATE, 30);
			} else if (currentMonth >= 10 && currentMonth <= 12) {
				c.set(Calendar.MONTH, 11);
				c.set(Calendar.DATE, 31);
			}
			now = longSdf.parse(shortSdf.format(c.getTime()) + " 23:59:59");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return now;
	}

	/**
	 * 
	 * @Title: getCurrentDay
	 * @Description: TODO(获取当前日)
	 * @param: @return
	 * @return: int
	 * @throws
	 * @author liul
	 * @Date 2014年5月28日 下午7:00:43
	 */
	public static int getCurrentDay() {
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 
	  * @Title:        getLastMonthFirstDay
	  * @Description:  TODO(上月第一天)
	  * @param:        @return   
	  * @return:       String   
	  * @throws
	  * @author        liul
	  * @Date          2014年5月28日 下午7:12:28
	 */
	public static String getLastMonthFirstDay() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		// 获取前月的第一天
		Calendar cal_1 = Calendar.getInstance();// 获取当前日期
		cal_1.add(Calendar.MONTH, -1);
		cal_1.set(Calendar.DAY_OF_MONTH, 1);// 设置为1号,当前日期既为本月第一天
		return format.format(cal_1.getTime());
	}
	
	/**
	 * 
	  * @Title:        getLastMonthLastDay
	  * @Description:  TODO(上月最后一天)
	  * @param:        @return   
	  * @return:       String   
	  * @throws
	  * @author        liul
	  * @Date          2014年5月28日 下午7:12:49
	 */
	public static String getLastMonthLastDay() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		//获取前月的最后一天
        Calendar cale = Calendar.getInstance();   
        cale.set(Calendar.DAY_OF_MONTH,0);//设置为1号,当前日期既为本月第一天 
        return format.format(cale.getTime());
	}
	
	
	/** 
     * 获取当年的第一天 
     * @param year 
     * @return 
     */  
    public static Date getCurrYearFirst(){  
        Calendar currCal=Calendar.getInstance();    
        int currentYear = currCal.get(Calendar.YEAR); 
        return getYearFirst(currentYear);  
    }  
      
    /** 
     * 获取当年的最后一天 
     * @param year 
     * @return 
     */  
    public static Date getCurrYearLast(){  
        Calendar currCal=Calendar.getInstance();    
        int currentYear = currCal.get(Calendar.YEAR);  
        return getYearLast(currentYear);  
    }  
      
    /** 
     * 获取某年第一天日期 
     * @param year 年份 
     * @return Date 
     */  
    public static Date getYearFirst(int year){  
        Calendar calendar = Calendar.getInstance();  
        calendar.clear();  
        calendar.set(Calendar.YEAR, year);  
        Date currYearFirst = calendar.getTime();  
        return currYearFirst;  
    }  
      
    /** 
     * 获取某年最后一天日期 
     * @param year 年份 
     * @return Date 
     */  
    public static Date getYearLast(int year){  
        Calendar calendar = Calendar.getInstance();  
        calendar.clear();  
        calendar.set(Calendar.YEAR, year);  
        calendar.roll(Calendar.DAY_OF_YEAR, -1);  
        Date currYearLast = calendar.getTime();  
          
        return currYearLast;  
    }  
    
    
	// 判断给定日期是周几
	public static int getWeekOfDate(Date dt) {
		//String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0)
			w = 0;
		return w;
	}
	
	// 获取当前年份
	public static String getCurrentYear(){
		Calendar cal = Calendar.getInstance();
	    int year = cal.get(Calendar.YEAR);
	    return year + "";
	}
	
	// 获取当前年份
	public static String getCurrentMonth(){
			Calendar cal = Calendar.getInstance();
		    int month = cal.get(Calendar.MONTH) + 1;
		    return month + "";
	}
	
	/**
	 * 获取时间年
	 */
	public static String getYear(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
	    int year = cal.get(Calendar.YEAR);
	    return year + "";
	}
	
	/**
	 * 获取时间月
	 */
	public static String getMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
	    int month = cal.get(Calendar.MONTH)+1;
	    return month + "";
	}
	
	/**
	 * 获取时间年
	 */
	public static Date getDateByAddMonth(Date date, int amount) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, amount);
		return cal.getTime();
	}
	
	/**
	 * 获取月
	 */
	public static String getAddMonth(Date date, int amount) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, amount);
	    int month = cal.get(Calendar.MONTH)+1;
	    return month + "";
	}
	
	/**
	 * 把时间转换为Date型，2011-09-07 转换为日期型
	 * 
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse("2016-09-21");
		sdf = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
		System.out.println(sdf.format(d));
	}

}