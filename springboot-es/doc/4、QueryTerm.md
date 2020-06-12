###精确查询

精确查询，查询地址为 北京市通州区 的人员信息：

查询条件不会进行分词，但是查询内容可能会分词，导致查询不到。之前在创建索引时设置 Mapping 中 address 字段存在 keyword 字段是专门用于不分词查询的子字段。
```
GET dztt-user/_search
{
  "query": {
    "term": {
      "address.keyword": {
        "value": "北京市通州区"
      }
    }
  }
}
```

###精确查询-多内容查询

精确查询，查询地址为 北京市丰台区、北京市昌平区 或 北京市大兴区 的人员信息：
```
GET dztt-user/_search
{
  "query": {
    "terms": {
      "address.keyword": [
        "北京市丰台区",
        "北京市昌平区",
        "北京市大兴区"
      ]
    }
  }
}
```