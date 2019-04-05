import six
from flask import Flask, jsonify, abort, request, make_response, url_for
from flask_httpauth import HTTPBasicAuth


class Controller(object):

    app = Flask(__name__, static_url_path="")
    auth = HTTPBasicAuth()

    def __init__(self, db):
        self.db = db

    def run(self):
        self.app.run(debug=True)


    #@auth.get_password
    def get_password(self, username):
        if username == 'abc':
            return 'python'
        return None

    @auth.error_handler
    def unauthorized(self):
        return make_response(jsonify({'error': 'Unauthorized access'}), 403)


    @app.errorhandler(400)
    def bad_request(self, error):
        return make_response(jsonify({'error': 'Bad request'}), 400)


    @app.errorhandler(404)
    def not_found(self, error):
        return make_response(jsonify({'error': 'Not found'}), 404)


    @app.route('/v1/user/<int:id>', methods=['GET'])
    #@auth.login_required
    def read(id):
        #if not request.json or 'title' not in request.json:
        #    abort(400)
        #return jsonify({"id": "KEKID"})
        return jsonify(db.find_one({"date": date}))

    #@app.route('/v1/user/<int:id>/doc/all', methods=['GET'])
    #@app.route('/v1/user/<int:id>/doc/<int:id>', methods=['GET'])
    #@app.route('/v1/user/<int:id>/view/all', methods=['GET'])
    #@app.route('/v1/user/<int:id>/view/<int:id>', methods=['GET'])
