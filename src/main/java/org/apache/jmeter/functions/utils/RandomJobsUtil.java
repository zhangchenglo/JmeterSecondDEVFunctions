package org.apache.jmeter.functions.utils;
import java.util.Random;
public class RandomJobsUtil {
    private static final Random RANDOM = new Random();

    private static final String[] JOBS = {
            "软件工程师", "系统分析师", "网络工程师", "数据分析师", "人工智能工程师",
            "会计师", "财务分析师", "投资银行家", "税务顾问", "经济学家",
            "医生", "护士", "药剂师", "医疗技术人员", "牙医", "物理治疗师",
            "教师", "教育顾问", "培训师", "教育行政人员", "学校心理咨询师",
            "工程师", "生产经理", "质量控制员", "项目经理", "维修技师",
            "销售代表", "市场营销经理", "广告策划师", "公关专员", "客户服务专员",
            "律师", "法律顾问", "合规专员", "公证员", "法官",
            "平面设计师", "室内设计师", "摄影师", "动画师", "艺术导演",
            "建筑师", "房地产经纪人", "施工经理", "物业管理人员", "城市规划师",
            "物流经理", "供应链分析师", "仓库管理员", "采购专员", "运输协调员",
            "厨师", "酒店管理人员", "导游", "餐厅服务员", "旅游规划师",
            "人力资源经理", "招聘专员", "薪酬福利专员", "员工培训师", "组织发展顾问",
            "警察", "消防员", "社会工作者", "环保专员", "政府公务员"
    };


    public static String randomGenerateJobs(){

        int jobId = RANDOM.nextInt(JOBS.length);
        return JOBS[jobId];

    }
}
