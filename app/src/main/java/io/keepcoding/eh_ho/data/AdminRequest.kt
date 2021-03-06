package io.keepcoding.eh_ho.data

import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonObjectRequest
import io.keepcoding.eh_ho.BuildConfig
import org.json.JSONObject

class AdminRequest(
    method: Int,
    url: String,
    body: JSONObject?,
    listener: (response: JSONObject?) -> Unit,
    errorListener: (errorResponse: VolleyError) -> Unit
) : JsonObjectRequest(method, url, body, listener, errorListener) {

    override fun getHeaders(): MutableMap<String, String> {
        val headers = mutableMapOf<String, String>()
        headers["Api-Key"] = BuildConfig.DiscourseApiKey
        headers["Api-Username"] = BuildConfig.DiscourseAdmin

        return headers
    }
}