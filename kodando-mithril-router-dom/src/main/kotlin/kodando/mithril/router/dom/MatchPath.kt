package kodando.mithril.routing

import kotlin.js.json

fun matchPath(
    pathName: String?,
    path: String?,
    strict: Boolean,
    exact: Boolean,
    sensitive: Boolean,
    parentMatch: Match): Match? {

    if (path == null) {
        return parentMatch
    }

    val matcher = getOrPutCachedCompilePath(path, exact, strict, sensitive)
    val re = matcher.re
    val keys = matcher.keys
    val match = re.exec(pathName ?: "")?.asArray() ?: return null
    val url = match.first()!!
    val values = match.sliceArray(1 until match.size)
    val isExact = pathName === url

    if (exact && !isExact) {
        return null
    }

    val params = json(
        *keys
            .mapIndexed { index, key ->
                key to values[index]
            }
            .toTypedArray()
    )

    return Match(
        path = path,
        url = if (path === "/" && url === "") "/" else url,
        isExact = isExact,
        params = params
    )
}

private val matcherCache = mutableMapOf<String, Matcher>()

fun getOrPutCachedCompilePath(pattern: String, end: Boolean, strict: Boolean, sensitive: Boolean): Matcher {
    val cacheKey = "$pattern;end=$end;strict=$strict;sensitive=$sensitive"

    return matcherCache.getOrPut(cacheKey) {
        compilePath(pattern, end, strict, sensitive)
    }
}

fun compilePath(pattern: String, exact: Boolean, strict: Boolean, sensitive: Boolean): Matcher {
    val options = PathToRegExpOptions(sensitive, strict, exact)
    val keys = arrayOf<String>()
    val regex = pathToRegExp(pattern, keys, options)

    return Matcher(regex, keys)
}
