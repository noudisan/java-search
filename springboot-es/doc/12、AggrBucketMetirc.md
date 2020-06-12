##Metric 与 Bucket 聚合分析

按照员工岁数分桶、然后统计每个岁数员工工资最高值:
```
GET dztt-user/_search
{
  "size": 0,
  "aggs": {
    "salary_bucket": {
      "terms": {
        "field": "age",
        "size": "10"
      },
      "aggs": {
        "salary_max_user": {
          "top_hits": {
            "size": 1,
            "sort": [
              {
                "salary": {
                  "order": "desc"
                }
              }
            ]
          }
        }
      }
    }
  }
}
```