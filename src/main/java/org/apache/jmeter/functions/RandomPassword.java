package org.apache.jmeter.functions;

import com.github.javafaker.Faker;
import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class RandomPassword extends AbstractFunction{

    private final static String key="__RandomPassword";
    private static String minNumber = "";

    private static String maxNumber = "";

    private static String isTrue = "";

    private static String isFalse = "";



    Faker faker = new Faker(Locale.CHINA);

    @Override
    public List<String> getArgumentDesc() {
        LinkedList<String> list = new LinkedList<>();
        list.add("最小长度(阿拉伯数字) 必填");
        list.add("最大长度(阿拉伯数字) 必填");
        list.add("是否大写(填写为：true/false) 非必填 默认为false");
        list.add("是否包含特殊字符(填写为：true/false) 非必填 默认为false");
        return list;
    }


    @Override
    public void setParameters(Collection<CompoundVariable> collection) throws InvalidVariableException {
        // collection 为 getArgumentDesc 函数接收到的用户输入的值
        checkParameterCount(collection, 4);
        Object[] array = collection.toArray();
        minNumber = ((CompoundVariable)array[0]).execute();
        maxNumber = ((CompoundVariable)array[1]).execute();
        isTrue = ((CompoundVariable)array[2]).execute();
        isFalse = ((CompoundVariable)array[3]).execute();

    }


    @Override
    public String execute(SampleResult sampleResult, Sampler sampler) throws InvalidVariableException {
        String pwd = faker.internet().password(Integer.parseInt(minNumber), Integer.parseInt(maxNumber),
                Boolean.parseBoolean(isTrue), Boolean.parseBoolean(isFalse));

        return pwd;
    }


    @Override
    public String getReferenceKey() {
        return key;
    }


}
