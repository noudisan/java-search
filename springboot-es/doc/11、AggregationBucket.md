##Bucket 聚合分析

按岁数进行聚合分桶，统计各个岁数员工的人数：

```
GET dztt-user/_search
{
  "size": 0,
  "aggs": {
    "age_bucket": {
      "terms": {
        "field": "age",
        "size": "10"
      }
    }
  }
}
```

按工资范围进行聚合分桶，统计工资在 3000-5000、5000-9000 和 9000 以上的员工信息：

```
GET dztt-user/_search
{
  "aggs": {
    "salary_range_bucket": {
      "range": {
        "field": "salary",
        "ranges": [
          {
            "key": "低级员工",
            "to": 3000
          },{
            "key": "中级员工",
            "from": 5000,
            "to": 9000
          },{
            "key": "高级员工",
            "from": 9000
          }
        ]
      }
    }
  }
}
```

按照时间范围进行分桶，统计 1985-1990 年和 1990-1995 年出生的员工信息：

```
GET dztt-user/_search
{
  "size": 10,
  "aggs": {
    "date_range_bucket": {
      "date_range": {
        "field": "birthDate",
        "format": "yyyy",
        "ranges": [
          {
            "key": "出生日期1985-1990的员工",
            "from": "1985",
            "to": "1990"
          },{
            "key": "出生日期1990-1995的员工",
            "from": "1990",
            "to": "1995"
          }
        ]
      }
    }
  }
}
```

按工资多少进行聚合分桶，设置统计的最小值为 0，最大值为 12000，区段间隔为 3000：
```
GET dztt-user/_search
{
  "size": 0,
  "aggs": {
    "salary_histogram": {
      "histogram": {
        "field": "salary",
        "extended_bounds": {
          "min": 0,
          "max": 12000
        },
        "interval": 3000
      }
    }
  }
}
```

按出生日期进行分桶：

```
GET dztt-user/_search
{
  "size": 0,
  "aggs": {
    "birthday_histogram": {
      "date_histogram": {
        "format": "yyyy",
        "field": "birthDate",
        "interval": "year"
      }
    }
  }
}
```