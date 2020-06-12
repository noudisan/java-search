##Metric 聚合分析

统计员工总数、工资最高值、工资最低值、工资平均工资、工资总和：
```
GET /dztt-user/_search
{
  "size": 0,
  "aggs": {
    "salary_stats": {
      "stats": {
        "field": "salary"
      }
    }
  }
}
```

统计员工工资最低值：
```
GET /dztt-user/_search
{
  "size": 0,
  "aggs": {
    "salary_min": {
      "min": {
        "field": "salary"
      }
    }
  }
}
```


统计员工工资最高值：
```
GET /dztt-user/_search
{
  "size": 0,
  "aggs": {
    "salary_max": {
      "max": {
        "field": "salary"
      }
    }
  }
}
```

统计员工工资平均值：
```
GET /dztt-user/_search
{
  "size": 0,
  "aggs": {
    "salary_avg": {
      "avg": {
        "field": "salary"
      }
    }
  }
}
```

统计员工工资总值：
```
GET /dztt-user/_search
{
  "size": 0,
  "aggs": {
    "salary_sum": {
      "sum": {
        "field": "salary"
      }
    }
  }
}
```

统计员工总数：
```
GET /dztt-user/_search
{
  "size": 0,
  "aggs": {
    "employee_count": {
      "value_count": {
        "field": "salary"
      }
    }
  }
}
```

统计员工工资百分位：
```
GET /dztt-user/_search
{
  "size": 0,
  "aggs": {
    "salary_percentiles": {
      "percentiles": {
        "field": "salary"
      }
    }
  }
}
```
