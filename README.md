# -solr-index-data-using-solrj


**Apache-Solr kurulum ve Collection oluşurma:

https://lucene.apache.org/solr/guide/8_2/solr-tutorial.html


**Apache-Solr'da oluşturduğum collection'a ekleme yapabilmek için :
- ekleme yapmak istediğim alanların schema.xml'de tanımlı olması gerekir.
Schema.xml -> solr.install.dir/server/solr/core-name/conf/ yolunun altında.

**Core oluşturduğum ManagedSchema olarak gelir.Değişiklik yapmak için ManagedSchema'yı Schema.xml'e çevirmeliyim:
https://lucene.apache.org/solr/guide/8_2/schema-factory-definition-in-solrconfig.html

**Schema.xml'e ekleme yapmak istediğim alanları tanımlıyorum:
> <field name="id" type="string" indexed="true" stored="true" required="false" multiValued="false" />
> <field name="fiyat" type="string" indexed="true" stored="true" required="false" multiValued="false" />
> <field name="türü" type="string" indexed="true" stored="true" required="false" multiValued="false" />
> <field name="baslik" type="string" indexed="true" stored="true" required="false" multiValued="false" />


