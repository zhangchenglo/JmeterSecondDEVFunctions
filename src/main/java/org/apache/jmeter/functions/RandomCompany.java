package org.apache.jmeter.functions;

import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.functions.utils.RandomCompanyUtil;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;

import java.util.Collection;
import java.util.List;

public class RandomCompany extends AbstractFunction{

    private static final String KEY =  "__RandomCompany";

    @Override
    public String execute(SampleResult sampleResult, Sampler sampler) throws InvalidVariableException {
        return RandomCompanyUtil.randomGenerateCompanyName();
    }

    @Override
    public void setParameters(Collection<CompoundVariable> collection) throws InvalidVariableException {

    }

    @Override
    public String getReferenceKey() {
        return KEY;
    }

    @Override
    public List<String> getArgumentDesc() {
        return null;
    }
}
