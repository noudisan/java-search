##布尔查询

查询出生在 1990-1995 年期间，且地址在 北京市昌平区、北京市大兴区、北京市房山区 的员工信息：
```
GET /dztt-user/_search
{
  "query": {
    "bool": {
      "filter": {
        "range": {
          "birthDate": {
            "format": "yyyy",
            "gte": 1990,
            "lte": 1995
          }
        }
      },
      "must": [
        {
          "terms": {
            "address.keyword": [
              "北京市昌平区",
              "北京市大兴区",
              "北京市房山区"
            ]
          }
        }
      ]
    }
  }
}
```