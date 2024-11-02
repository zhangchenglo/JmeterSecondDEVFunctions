package org.apache.jmeter.functions.utils;

import java.util.Random;

public class RandomCompanyUtil {

    private static final Random RANDOM = new Random();

    private static final String[] PROVINCES = {
            "北京", "天津", "上海", "重庆", "河北", "山西", "内蒙古", "辽宁", "吉林", "黑龙江",
            "江苏", "浙江", "安徽", "福建", "江西", "山东", "河南", "湖北", "湖南", "广东",
            "广西", "海南", "重庆", "四川", "贵州", "云南", "西藏", "陕西", "甘肃", "青海",
            "宁夏", "新疆", "香港", "澳门", "台湾"
    };

    private static final String[] PREFIXES = {
            "亿达", "宏伟", "星光", "龙兴", "华腾", "中源", "英特", "伟业", "赛博", "创亿",
            "东盛", "优联", "云峰", "博雅", "达成", "旭日", "长虹", "睿智", "金桥", "诚达"
    };

    private static final String[] SUFFIXES = {
            "科技", "集团", "有限公司", "实业公司", "投资公司", "建设公司", "服务公司", "网络公司", "传媒公司", "发展公司",
            "贸易", "资源", "物业", "生物", "环保", "能源", "医疗", "教育", "文化", "金融", "游戏", "电子", "新材料",
            "生物科技", "教育科技", "塑料制品", "金属制品", "日用品", "食品", "医疗器械", "物流", "装饰工程", "建筑工程",
            "建筑装饰", "教育信息咨询", "商务信息咨询", "餐饮", "实业", "金属材料销售", "国际货运代理", "汽车用品", "机械设备租赁"
    };


    public static String randomGenerateCompanyName() {
        String provinces = PROVINCES[RANDOM.nextInt(PROVINCES.length)];
        String prefix = PREFIXES[RANDOM.nextInt(PREFIXES.length)];
        String suffix = SUFFIXES[RANDOM.nextInt(SUFFIXES.length)];
        return provinces + prefix + suffix;
    }

}
