##范围查询(range)

查询岁数 ≥ 30 岁的员工数据：
```
GET /dztt-user/_search
{
  "query": {
    "range": {
      "age": {
        "gte": 30
      }
    }
  }
}
```

###查询生日距离现在 30 年间的员工数据：
```
GET dztt-user/_search
```
```json
{
  "query": {
    "range": {
      "birthDate": {
        "gte": "now-30y"
      }
    }
  }
}
```