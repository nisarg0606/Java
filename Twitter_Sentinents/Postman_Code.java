// package Twitter_Sentinents;

// public class Postman_Code {
//     OkHttpClient client = new OkHttpClient().newBuilder()
//   .build();
// MediaType mediaType = MediaType.parse("text/plain");
// RequestBody body = RequestBody.create(mediaType, "");
// Request request = new Request.Builder()
//   .url("https://api.twitter.com/2/tweets/search/all?query=-is:retweet -is:reply place_country:IN place:b850c1bfd38f30e0(prices OR price OR inflation OR deflation OR \"high prices\" OR \"high price\" OR \"cost of living\" OR \"expensive bills\" OR \"high petrol price\" OR disinflation OROR \"less expensive\" OR \"less expensive bills\" OR \"high rents\" OR \"high bills\" OR \"high diesel price\" OR \"indian economy\" OR \"monetary policy\" OR policy OR unemployment lang:en)&max_results=10&tweet.fields=author_id,created_at,geo,id,text&expansions=author_id,geo.place_id&place.fields=country,country_code,full_name,geo,id,name,place_type&user.fields=created_at,description,id,location,name,url,username")
//   .method("GET", body)
//   .addHeader("Authorization", "Bearer ")
//   .addHeader("Cookie", "guest_id=v1%3A166986905483871896")
//   .build();
// Response response = client.newCall(request).execute();
// }
