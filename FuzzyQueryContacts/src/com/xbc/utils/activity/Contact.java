package com.xbc.utils.activity;

/**
 * @author xiaobo.cui 2014年11月24日 下午5:36:29
 * 封装 name，number，sortKey的联系人的类
 */
public class Contact {
	public Contact() {

	}

	public Contact(String name, String number, String sortKey) {
		this.name = name;
		this.number = number;
		this.sortKey = sortKey;
		if (number != null) {
			this.simpleNumber = number.replaceAll("\\-|\\s", "");// 去掉号码中的空格和换行
		}
	}

	public String name;
	public String number;
	public String simpleNumber;
	public String sortKey;

	/**
	 * 重写hashCode()方法是为了提高比较两个对象是否相等时的效率
	 * 
	 * java 比较中遵循的原则 1
	 * 先比较两个对象的hashCode()是否相等，如果不等，认为两个对象不相等，如果hashCode()的值相等，再调用equals方法 2
	 * equals（）方法放回true，表示两个对象相等，否则不相等
	 * 
	 * 总结： 两个对象的hashCode()不相等，则两个对象一定不相等；hashCode()值相等，还得看equals（）是否返回true 即
	 * java比较两个对象是否相等主要看equals方法
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((sortKey == null) ? 0 : sortKey.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (sortKey == null) {
			if (other.sortKey != null)
				return false;
		} else if (!sortKey.equals(other.sortKey))
			return false;
		return true;
	}

}
