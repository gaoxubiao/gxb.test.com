package com.gxb.test;

/*
 * ����ģʽ��Ӧ�ó�����
 * ������еķ�����ʹ�õ�ʱ����Ҫ��ԭ�еķ������иĽ�����ʱ�����ְ취��

 1���޸�ԭ�еķ�������Ӧ������Υ���ˡ�����չ���ţ����޸Ĺرա���ԭ��

 2�����ǲ���һ�����������ԭ�еķ������ҶԲ����Ľ�����п��ơ����ַ������Ǵ���ģʽ��

 ʹ�ô���ģʽ�����Խ����ܻ��ֵĸ��������������ں���ά����
 * */
public class SourcePoxy implements DeatorInterface {

	private SourceModel source;

	public SourcePoxy() {
		super();
		this.source = new SourceModel();
	}

	@Override
	public void datorTest() {
		before();
		System.err.println("����ģʽ....");
		source.datorTest();
		after();
	}

	private void before() {
		System.err.println("����֮ǰ...");

	}

	private void after() {
		System.err.println("����֮��...");
	}

}
