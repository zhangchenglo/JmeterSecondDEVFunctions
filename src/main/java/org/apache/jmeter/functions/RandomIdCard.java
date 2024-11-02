package org.apache.jmeter.functions;

import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.functions.utils.RandomIdCardUtils;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;

import java.util.*;

public class RandomIdCard extends AbstractFunction{


    private static final String KEY_ = "__RandomIdCard";

    @Override
    public String execute(SampleResult sampleResult, Sampler sampler) throws InvalidVariableException {

        return RandomIdCardUtils.getRandomID();
    }

    @Override
    public void setParameters(Collection<CompoundVariable> collection) throws InvalidVariableException {

    }

    @Override
    public String getReferenceKey() {
        return KEY_;
    }

    @Override
    public List<String> getArgumentDesc() {
        return null;
    }



}
